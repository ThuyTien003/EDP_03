package bai2_proxy_7;

public class Main {
    public static void main(String[] args) {
        Document doc1 = new SecureDocumentProxy("confidential.txt", "guest");
        Document doc2 = new SecureDocumentProxy("confidential.txt", "admin");

        System.out.println("Người dùng guest:");
        doc1.read();

        System.out.println("\nNgười dùng admin:");
        doc2.read();
    }
}
