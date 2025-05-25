package bai1_bridge_2;

public class BasicRemote extends RemoteControl {
    public BasicRemote(TV tv) {
        super(tv);
    }

    public void turnOn() {
        tv.on();
    }

    public void turnOff() {
        tv.off();
    }

    public void setChannel(int channel) {
        tv.setChannel(channel);
    }
}



