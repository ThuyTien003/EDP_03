package bai2_decorator_4;

public abstract class EmailDecorator implements EmailService {
    protected EmailService wrapped;

    public EmailDecorator(EmailService wrapped) {
        this.wrapped = wrapped;
    }

    public void send(String message) {
        wrapped.send(message);
    }
}

