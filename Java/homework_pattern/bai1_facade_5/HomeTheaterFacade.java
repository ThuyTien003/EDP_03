package bai1_facade_5;

class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private SoundSystem sound;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem sound) {
        this.dvd = dvd;
        this.projector = projector;
        this.sound = sound;
    }

    public void watchMovie(String movie) {
        System.out.println("\nKhởi động chế độ xem phim...");
        projector.on();
        projector.setInput("DVD");
        sound.on();
        sound.setVolume(20);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("\nKết thúc xem phim...");
        dvd.off();
        sound.off();
        projector.off();
    }
}
