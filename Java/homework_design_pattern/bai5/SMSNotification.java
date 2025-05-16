package bai5;

public class SMSNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Gui thong bao qua SMS");
    }
}
