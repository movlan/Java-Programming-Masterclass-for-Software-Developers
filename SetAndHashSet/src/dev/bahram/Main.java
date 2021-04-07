package dev.bahram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempSatellite = new Moon("Moon", 27);
        solarSystem.put(tempSatellite.getKey(), temp);
        temp.addSatellite(tempSatellite);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempSatellite = new Moon("Deimos", 1.3);
        solarSystem.put(tempSatellite.getKey(), tempSatellite);
        temp.addSatellite(tempSatellite); // temp is still Mars

        tempSatellite = new Moon("Phobos", 0.3);
        solarSystem.put(tempSatellite.getKey(), tempSatellite);
        temp.addSatellite(tempSatellite); // temp is still Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempSatellite = new Moon("Io", 1.8);
        solarSystem.put(tempSatellite.getKey(), tempSatellite);
        temp.addSatellite(tempSatellite); // temp is still Jupiter

        tempSatellite = new Moon("Europa", 3.5);
        solarSystem.put(tempSatellite.getKey(), tempSatellite);
        temp.addSatellite(tempSatellite); // temp is still Jupiter

        tempSatellite = new Moon("Ganymede", 7.1);
        solarSystem.put(tempSatellite.getKey(), tempSatellite);
        temp.addSatellite(tempSatellite); // temp is still Jupiter

        tempSatellite = new Moon("Callisto", 16.7);
        solarSystem.put(tempSatellite.getKey(), tempSatellite);
        temp.addSatellite(tempSatellite); // temp is still Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        System.out.println("Planets:");
        for (HeavenlyBody planet: planets) {
            System.out.println("\t" + planet.getKey());
        }

        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mars", HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moons of " + body.getKey());
        for (HeavenlyBody bodySatellites: body.getSatellites())  {
            System.out.println("\t" + bodySatellites.getKey());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet: planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All moons: ");
        for (HeavenlyBody moon: moons)  {
            System.out.println("\t" + moon.getKey());
        }

        HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
        planets.add(pluto);

        System.out.println("Planets:");
        for (HeavenlyBody planet: planets) {
            System.out.println(planet);
//            System.out.println("\t" + planet.getKey() + ": " + planet.getOrbitalPeriod());
        }

        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));

        solarSystem.put(pluto.getKey(), pluto);
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.DWARF_PLANET)));

        System.out.println();
        System.out.println("Solar system contains:");
        for (HeavenlyBody heavenlyBody: solarSystem.values()) {
            System.out.println(heavenlyBody);
        }
    }
}
