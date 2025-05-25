package bai2_decorator_4;

public class EmailSender implements EmailService {
    public void send(String message) {
        System.out.println("Gửi email: " + message);
    }
}

