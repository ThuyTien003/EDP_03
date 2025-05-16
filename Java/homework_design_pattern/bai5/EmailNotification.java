package bai5;

public class EmailNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Gui thong bao qua email ");
    }
}
