package B3_qlfile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileHandler handler = null;

        System.out.println("Chọn loại file: 1. Text  2. Image  3. Video");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập tên file: ");
        String fileName = sc.nextLine();

        switch (type) {
            case 1:
                handler = new TextFileHandler(fileName);
                break;
            case 2:
                handler = new ImageFileHandler(fileName);
                break;
            case 3:
                handler = new VideoFileHandler(fileName);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return;
        }

        while (true) {
            System.out.println("\nChọn thao tác:");
            System.out.println("1. Đọc\n2. Ghi\n3. Xóa\n4. Nén\n5. Mã hóa\n6. Thoát");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    handler.read();
                    break;
                case 2:
                    System.out.print("Nhập nội dung ghi: ");
                    String content = sc.nextLine();
                    handler.write(content);
                    break;
                case 3:
                    handler.delete();
                    break;
                case 4:
                    if (handler instanceof Compressible)
                        ((Compressible) handler).compress();
                    else
                        System.out.println("File này không hỗ trợ nén.");
                    break;
                case 5:
                    if (handler instanceof Encryptable)
                        ((Encryptable) handler).encrypt();
                    else
                        System.out.println("File này không hỗ trợ mã hóa.");
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
