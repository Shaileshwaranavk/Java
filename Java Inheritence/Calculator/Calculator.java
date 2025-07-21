package Calculator;

class Calculator {
    void add(int a, int b) {
        System.out.println("Sum of ints: " + (a + b));
    }

    void add(float a, float b) {
        System.out.println("Sum of floats: " + (a + b));
    }

    void add(int a, float b) {
        System.out.println("Sum of int and float: " + (a + b));
    }
}

class Driver {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(5, 10);
        c.add(2.5f, 3.5f);
        c.add(7, 4.5f);
    }
}
