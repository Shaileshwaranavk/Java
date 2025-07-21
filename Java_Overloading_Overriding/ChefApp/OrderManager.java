package ChefApp;

class OrderManager {
    void placeOrder(String dish) {
        System.out.println(dish);
    }

    void placeOrder(String dish, int qty) {
        System.out.println(dish + " " + qty);
    }

    void placeOrder(String dish, int qty, int table) {
        System.out.println(dish + " " + qty + " " + table);
    }

    public static void main(String[] args) {
        OrderManager o = new OrderManager();
        o.placeOrder("Pizza");
        o.placeOrder("Burger", 2);
        o.placeOrder("Pasta", 3, 5);
    }
}
