package bai1_facade_5;

class Projector {
    public void on() {
        System.out.println("Projector bật");
    }

    public void setInput(String input) {
        System.out.println("Projector đầu vào: " + input);
    }

    public void off() {
        System.out.println("Projector tắt");
    }
}
