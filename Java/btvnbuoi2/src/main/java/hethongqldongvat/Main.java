package hethongqldongvat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so dong vat: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nDong vat thu " + (i + 1));
            System.out.print("Loai (1 - Cho, 2 - Meo, 3 - Chim): ");
            int type = Integer.parseInt(scanner.nextLine());
            System.out.print("Ten: ");
            String name = scanner.nextLine();

            switch (type) {
                case 1:
                    zoo.addAnimal(new Dog(name));
                    break;
                case 2:
                    zoo.addAnimal(new Cat(name));
                    break;
                case 3:
                    zoo.addAnimal(new Bird(name));
                    break;
                default:
                    System.out.println("Loai khong hop le!");
                    i--;
            }
        }

        zoo.showAll();
        zoo.statistics();

        scanner.close();
    }
}
