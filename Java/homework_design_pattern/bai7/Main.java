package bai7;

public class Main {
    public static void main(String[] args) {
        String os = "windows";

        GUIFactory factory;
        if (os.equalsIgnoreCase("windows")) {
            factory = new WindowsFactory();
        } else if (os.equalsIgnoreCase("mac")) {
            factory = new MacFactory();
        } else {
            throw new IllegalArgumentException("Unsupported OS: " + os);
        }

        App app = new App(factory);
        app.render();
    }
}

