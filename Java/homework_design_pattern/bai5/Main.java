package bai5;

public class Main {
    public static void main(String[] args) {
        Notification n1 = NotificationFactory.createNotification("email");
        if (n1 != null) n1.send();

        Notification n2 = NotificationFactory.createNotification("sms");
        if (n2 != null) n2.send();

        Notification n3 = NotificationFactory.createNotification("push");
        if (n3 != null) n3.send();

        Notification n4 = NotificationFactory.createNotification("unknown");
        if (n4 != null) n4.send();
    }
}

