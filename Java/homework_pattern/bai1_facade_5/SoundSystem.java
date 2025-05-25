package bai1_facade_5;

class SoundSystem {
    public void on() {
        System.out.println("Hệ thống âm thanh bật");
    }

    public void setVolume(int level) {
        System.out.println("Âm lượng: " + level);
    }

    public void off() {
        System.out.println("Hệ thống âm thanh tắt");
    }
}
