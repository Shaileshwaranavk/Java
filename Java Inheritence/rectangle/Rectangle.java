package rectangle;

class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        length = 10;
        breadth = 15;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area: " + (length * breadth));
    }
}

class Driver {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);
        r1.area();
        r2.area();
    }
}
