package hethongqldongvat;

import java.util.*;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAll() {
        System.out.println("\nDS dong vat trong so thu ");
        for (Animal animal : animals) {
            animal.makeSound();
            animal.move();
            System.out.println();
        }
    }

    public void statistics() {
        int dogs = 0, cats = 0, birds = 0;
        for (Animal animal : animals) {
            if (animal instanceof Dog) dogs++;
            else if (animal instanceof Cat) cats++;
            else if (animal instanceof Bird) birds++;
        }
        System.out.println("\nThong ke ");
        System.out.println("So luong cho: " + dogs);
        System.out.println("So luong meo: " + cats);
        System.out.println("So luong chim: " + birds);
    }
}

