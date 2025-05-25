package bai1_proxy_7;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("cat.png");

        System.out.println("Lần đầu gọi:");
        image.display();

        System.out.println("\nGọi lần 2:");
        image.display();
    }
}

