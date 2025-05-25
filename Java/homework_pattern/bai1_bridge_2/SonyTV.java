package bai1_bridge_2;

public class SonyTV implements TV {
    public void on() {
        System.out.println("Sony TV is ON");
    }

    public void off() {
        System.out.println("Sony TV is OFF");
    }

    public void setChannel(int channel) {
        System.out.println("Sony TV channel set to " + channel);
    }
}
