package Resturant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Scanner scanner = new Scanner(System.in);

        // Add some menu items
        restaurant.addMenuItem(new MenuItem("Burger", 8.99));
        restaurant.addMenuItem(new MenuItem("Pizza", 12.99));
        restaurant.addMenuItem(new MenuItem("Salad", 6.99));

        boolean running = true;
        while (running) {
            System.out.println("1. View Menu");
            System.out.println("2. Place Order");
            System.out.println("3. View Orders");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Menu:");
                    for (MenuItem item : restaurant.getMenu()) {
                        System.out.println(item);
                    }
                    break;
                case 2:
                    Order order = new Order();
                    boolean ordering = true;
                    while (ordering) {
                        System.out.println("Enter item number to add to order (or 0 to finish):");
                        for (int i = 0; i < restaurant.getMenu().size(); i++) {
                            System.out.println((i + 1) + ". " + restaurant.getMenu().get(i));
                        }
                        int itemNumber = scanner.nextInt();
                        if (itemNumber == 0) {
                            ordering = false;
                        } else if (itemNumber > 0 && itemNumber <= restaurant.getMenu().size()) {
                            order.addItem(restaurant.getMenu().get(itemNumber - 1));
                        } else {
                            System.out.println("Invalid item number.");
                        }
                    }
                    restaurant.placeOrder(order);
                    System.out.println("Order placed:");
                    System.out.println(order);
                    break;
                case 3:
                    System.out.println("Orders:");
                    for (Order o : restaurant.getOrders()) {
                        System.out.println(o);
                    }
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        scanner.close();
    }
}
