package dev.bahram;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", .86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("Chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.50, 7);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.45, 200);
        stockList.addStock(temp);

        temp = new StockItem("Door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("Juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("Phone", 8.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("Towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("Vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket timsBasket = new Basket("Tim");

        sellItem(timsBasket, "Car", 1);
        System.out.println(timsBasket);

        sellItem(timsBasket, "Car", 1);
        System.out.println(timsBasket);

        sellItem(timsBasket, "Car", 1);
        sellItem(timsBasket, "Spanner", 5);

        sellItem(timsBasket, "Juice", 4);
        sellItem(timsBasket, "Cup", 12);
        sellItem(timsBasket, "Bread", 1);

        Basket basket = new Basket("New Basket");
        sellItem(basket, "Cup", 100);
        sellItem(basket, "Juice", 5);
        removeItem(basket, "Cup", 1);
        System.out.println(basket);

        removeItem(timsBasket, "Car", 1);
        removeItem(timsBasket, "Cup", 9);
        removeItem(timsBasket, "Car", 1);
        System.out.println("cars removed: " + removeItem(timsBasket, "Car", 1)); // should not remove

        System.out.println(timsBasket);

        removeItem(timsBasket, "Bread", 1);
        removeItem(timsBasket, "Cup", 102);
        removeItem(timsBasket, "Juice", 9);
        System.out.println(timsBasket);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkout(basket);
        System.out.println(basket);
        System.out.println(stockList);

        checkout(timsBasket);
        System.out.println(timsBasket);
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);

        }
        return 0;
    }

    public static void checkout(Basket basket) {
        for (Map.Entry<StockItem, Integer> item: basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
