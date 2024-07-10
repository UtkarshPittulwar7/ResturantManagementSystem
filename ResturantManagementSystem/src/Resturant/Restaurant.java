package Resturant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<MenuItem> menu;
    private List<Order> orders;

    public Restaurant() {
        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}
