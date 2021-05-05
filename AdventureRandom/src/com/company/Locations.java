package com.company;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<>();
    private static Map<Integer, IndexRecord> index = new HashMap<>();

    public static void main(String[] args) throws IOException {
        try (RandomAccessFile rao = new RandomAccessFile("locations_rand.dat", "rwd")) {
            rao.writeInt(locations.size());
            int indexSize = locations.size() * 3 * Integer.BYTES;
            int locationStart = (int) (indexSize + rao.getFilePointer() + Integer.BYTES);
            System.out.println(indexSize);
            System.out.println(rao.getFilePointer());
            rao.writeInt(locationStart);

            long indexStart = rao.getFilePointer();

            int starPointer = locationStart;
            rao.seek(starPointer);

            for (Location location : locations.values()) {
                rao.writeInt(location.getLocationID());
                rao.writeUTF(location.getDescription());
                StringBuilder builder = new StringBuilder();
                for (String direction : location.getExits().keySet()) {
                    if (!direction.equalsIgnoreCase("Q")) {
                        builder.append(direction);
                        builder.append(",");
                        builder.append(location.getExits().get(direction));
                        builder.append(',');
                    }
                }
                rao.writeUTF(builder.toString());

                IndexRecord record = new IndexRecord(starPointer, (int) (rao.getFilePointer() - starPointer));
                index.put(location.getLocationID(), record);

                starPointer = (int) rao.getFilePointer();
            }

            rao.seek(indexStart);
            for (Integer locationID : index.keySet()) {
                rao.writeInt(locationID);
                rao.writeInt(index.get(locationID).getStartByte());
                rao.writeInt(index.get(locationID).getLength());
            }

        }
    }

    // 1. This first four bytes will contain the number of  locations (bytes 0-3)
    // 2. The next four bytes will contain the start offset of the locations section (bytes 4-7)
    // 3. the next section of the file will contain the index (index is 1692 bytes long. it will start at byte 8 and end at byte 1699
    // 4. The final section of the file will contain the location records (the data). It will start ath the byte 1700

    static {
        try (ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))) {
            boolean eof = false;
            while (!eof) {
                    try {
                        Location location = (Location) locFile.readObject();
                        System.out.println("Read location " + location.getLocationID() + ": " + location.getDescription());
                        System.out.println("Found " + location.getExits().size() + " exits");

                        locations.put(location.getLocationID(), location);
                    } catch (EOFException e) {
                        eof = true;
                    }
            }
        } catch (IOException e) {
            System.out.println("IOException " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException " + e.getMessage());
        }
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
