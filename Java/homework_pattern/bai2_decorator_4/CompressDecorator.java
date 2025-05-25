package bai2_decorator_4;

public class CompressDecorator extends EmailDecorator {
    public CompressDecorator(EmailService wrapped) {
        super(wrapped);
    }

    public void send(String message) {
        String compressed = "[Nén] " + message;
        super.send(compressed);
    }
}

