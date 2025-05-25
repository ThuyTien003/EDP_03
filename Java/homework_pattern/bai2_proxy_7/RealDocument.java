package bai2_proxy_7;

public class RealDocument implements Document{
    private String filename;

    public RealDocument(String filename) {
        this.filename = filename;
    }

    @Override
    public void read() {
        System.out.println("Đang đọc file: " + filename);
    }
}
