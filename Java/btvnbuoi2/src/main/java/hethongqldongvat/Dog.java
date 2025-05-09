package hethongqldongvat;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " sua: Gau!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " chay bang 4 chan.");
    }
}
