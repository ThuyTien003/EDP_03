package bai2;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Tin nhan thu nhat");
        logger2.log("Tin nhan thu hai");

        System.out.println(logger1 == logger2);
    }
}
