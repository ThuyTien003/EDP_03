package bai1_facade_5;

class DVDPlayer {
    public void on() {
        System.out.println("DVD Player bật");
    }

    public void play(String movie) {
        System.out.println("Đang phát phim: " + movie);
    }

    public void off() {
        System.out.println("DVD Player tắt");
    }
}

