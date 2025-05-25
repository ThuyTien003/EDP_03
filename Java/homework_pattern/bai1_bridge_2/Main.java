package bai1_bridge_2;

public class Main {
    public static void main(String[] args) {
        TV samsung = new SamsungTV();
        RemoteControl remote1 = new BasicRemote(samsung);
        remote1.turnOn();
        remote1.setChannel(5);
        remote1.turnOff();

        System.out.println();

        TV sony = new SonyTV();
        RemoteControl remote2 = new BasicRemote(sony);
        remote2.turnOn();
        remote2.setChannel(10);
        remote2.turnOff();
    }
}

