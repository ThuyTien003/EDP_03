package hethongqldongvat;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " keu: ec ec");
    }

    @Override
    public void move() {
        System.out.println(getName() + " bay tren bau troi.");
    }
}
