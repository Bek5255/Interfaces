package com.javastart.interfaces;

public class Main {
    public static void main(String[] args) {
    Animal lori = new Cat();
    Animal bob = new Dog();
    lori.say();
        System.out.println(bob.getAnimalTipe());
        findOwner(lori);
        findOwner(bob);

        System.out.println("Lori: " + ((Cat) lori).getOwner() + " Bob: " + ((Dog) bob).getOwner());
    }
    private static void findOwner (Animal animal){
        if (animal.getClass() == Cat.class){
            animal.setOwner("Cat+owner");
        }
        if (animal.getClass() == Dog.class){
            animal.setOwner("Dog_owner");
        }
    }
}
