package org.zoo;

class Animal {
    String name;
    String type;

    Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    void animalName() {
        System.out.println("Animal Name: " + name);
    }

    void animalType() {
        System.out.println("Animal Type: " + type);
    }
}

class Bird extends Animal {
    String birdCategory;

    Bird(String name, String type, String birdCategory) {
        super(name, type);
        this.birdCategory = birdCategory;
    }

    void birdType() {
        System.out.println("Bird Type: " + birdCategory);
    }

    public static void main(String[] args) {
        Bird b = new Bird("Parrot", "Bird", "Tropical");
        b.animalName();
        b.animalType();
        b.birdType();
    }
}

class Reptile extends Animal {
    String reptileCategory;

    Reptile(String name, String type, String reptileCategory) {
        super(name, type);
        this.reptileCategory = reptileCategory;
    }

    void reptileType() {
        System.out.println("Reptile Type: " + reptileCategory);
    }

    public static void main(String[] args) {
        Reptile r = new Reptile("Crocodile", "Reptile", "Aquatic");
        r.animalName();
        r.animalType();
        r.reptileType();
    }
}

class Zookeeper extends Animal {
    String keeperName;

    Zookeeper(String name, String type, String keeperName) {
        super(name, type);
        this.keeperName = keeperName;
    }

    void zooKeeperName() {
        System.out.println("Zookeeper Name: " + keeperName);
    }

    public static void main(String[] args) {
        Zookeeper z = new Zookeeper("Elephant", "Mammal", "Ravi Kumar");
        z.animalName();
        z.animalType();
        z.zooKeeperName();
    }
}
