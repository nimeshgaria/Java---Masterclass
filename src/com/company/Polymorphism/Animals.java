
package com.company.Polymorphism;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Pig();
        Animal myPig = new Dog();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myDog.animalSound();
        myPig.animalSound();


        // Runtime polymorphism
        System.out.println("Run time polymorphism");
        Animal a = new Pig();
        a.animalSound();
    }
}
