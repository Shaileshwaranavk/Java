package Zootopia;

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

class Bird extends Animal {
    boolean canFly;

    Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    void display() {
        super.display();
        System.out.println(canFly);
    }
}

class Mammal extends Animal {
    String diet;

    Mammal(String name, int age, String diet) {
        super(name, age);
        this.diet = diet;
    }

    void display() {
        super.display();
        System.out.println(diet);
    }
}

class ZooRegistry {
    public static void main(String[] args) {
        Bird b = new Bird("Parrot", 2, true);
        Mammal m = new Mammal("Lion", 5, "Carnivore");

        b.display();
        m.display();
    }
}
