package bai2_decorator_4;

public class EncryptDecorator extends EmailDecorator {
    public EncryptDecorator(EmailService wrapped) {
        super(wrapped);
    }

    public void send(String message) {
        String encrypted = "[Mã hóa] " + message;
        super.send(encrypted);
    }
}

