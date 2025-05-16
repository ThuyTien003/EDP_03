package bai1;

public class AppConfig {
    private static AppConfig instance;

    private AppConfig(){
        System.out.println("tao AppConfig");
    }

    public static AppConfig getInstance(){
        if (instance == null){
            instance = new AppConfig();
        }
        return instance;
    }

    public void printConfig(){
        System.out.println("In cau hinh");
    }
}
