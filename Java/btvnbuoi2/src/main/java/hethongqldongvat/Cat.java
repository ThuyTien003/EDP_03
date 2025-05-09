package hethongqldongvat;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " keu: MeoMeo");
    }

    @Override
    public void move() {
        System.out.println(getName() + " di bang 4 chan.");
    }
}

