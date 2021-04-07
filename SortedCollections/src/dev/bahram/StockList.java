package dev.bahram;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item) {
        if (item != null) {
            // Check if already have quantities of this item
            StockItem inStock = list.getOrDefault(item.getName(), item);
            // If there are already stocks on this item, adjust the quantity
            if (inStock != item) {
                item.adjustStock(inStock.availableQuantity());
            }

            list.put(item.getName(), item);
            return item.availableQuantity();
        }
        return 0;
    }

    public int sellStock(String itemName, int quantity) {
        StockItem inStock = list.get(itemName);

        if (inStock != null && quantity > 0){
            return inStock.finalizeStock(quantity);
        }
        return 0;

//        StockItem inStock = list.getOrDefault(itemName, null);
//
//        if (inStock != null && inStock.availableQuantity() >= quantity && quantity > 0){
//            inStock.adjustStock(-quantity);
//            return quantity;
//        }
//       return 0;
    }

    public int reserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);

        if (inStock != null && quantity > 0) {
            return inStock.reserveStock(quantity);
        }
        return 0;
    }

    public int unreserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);

        if (inStock != null && quantity > 0) {
            return inStock.unreserveStock(quantity);
        }
        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List:\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice();

            s = s + stockItem + ". There are " + stockItem.availableQuantity()
                    + " in stock. Value of items: " + itemValue + "\n";

            totalCost += itemValue;
        }

        return s + "Total stock value: " + totalCost;
    }
}
