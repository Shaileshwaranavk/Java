package order;

class Order {
    String itemName;
    int quantity;
    int pricePerItem = 100;

    void calculateBill() {
        int total = quantity * pricePerItem;
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: " + total);
    }
}

class Driver {
    public static void main(String[] args) {
        Order o = new Order();
        o.itemName = "Notebook";
        o.quantity = 5;
        o.calculateBill();
    }
}
