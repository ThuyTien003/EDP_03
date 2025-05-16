package bai1;

public class Main {
    public static void main(String[] args) {
        AppConfig appConfig1 = AppConfig.getInstance();
        AppConfig appConfig2 = AppConfig.getInstance();

        appConfig1.printConfig();

        System.out.println(appConfig1 == appConfig2);
    }
}
