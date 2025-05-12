package B3_qlfile;

public class ImageFileHandler extends FileHandler implements Compressible {

    public ImageFileHandler(String fileName) {
        super(fileName);
    }

    @Override
    public void read() {
        System.out.println("Xem hình ảnh: " + fileName);
    }

    @Override
    public void write(String content) {
        System.out.println("Ghi chú thích hình ảnh vào: " + fileName);
    }

    @Override
    public void delete() {
        System.out.println("Xóa hình ảnh: " + fileName);
    }

    @Override
    public void compress() {
        System.out.println("Nén hình ảnh: " + fileName);
    }
}

