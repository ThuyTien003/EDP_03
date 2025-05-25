package bai1_bridge_2;

public class SamsungTV implements TV {
    public void on() {
        System.out.println("Samsung TV is ON");
    }

    public void off() {
        System.out.println("Samsung TV is OFF");
    }

    public void setChannel(int channel) {
        System.out.println("Samsung TV channel set to " + channel);
    }
}
