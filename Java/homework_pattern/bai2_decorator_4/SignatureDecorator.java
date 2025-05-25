package bai2_decorator_4;

public class SignatureDecorator extends EmailDecorator {
    public SignatureDecorator(EmailService wrapped) {
        super(wrapped);
    }

    public void send(String message) {
        String signed = message + "\n-- Chữ ký điện tử";
        super.send(signed);
    }
}

