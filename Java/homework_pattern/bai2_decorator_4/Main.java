package bai2_decorator_4;

public class Main {
    public static void main(String[] args) {
        EmailService email = new EmailSender();

        email = new EncryptDecorator(email);
        email = new CompressDecorator(email);
        email = new SignatureDecorator(email);

        email.send("Tài liệu hợp đồng");
    }
}

