package bai1_facade_5;

public class Main {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();

        HomeTheaterFacade theater = new HomeTheaterFacade(dvd, projector, sound);
        theater.watchMovie("Avengers: Endgame");
        theater.endMovie();
    }
}

