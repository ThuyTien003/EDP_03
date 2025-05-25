package bai1_proxy_7;

public class RealImage implements Image{
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Đang tải ảnh từ đĩa: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Hiển thị ảnh: " + filename);
    }
}
