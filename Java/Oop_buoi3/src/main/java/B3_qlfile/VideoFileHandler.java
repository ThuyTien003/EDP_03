package B3_qlfile;

public class VideoFileHandler extends FileHandler {

    public VideoFileHandler(String fileName) {
        super(fileName);
    }

    @Override
    public void read() {
        System.out.println("Phát video: " + fileName);
    }

    @Override
    public void write(String content) {
        System.out.println("Ghi mô tả video vào: " + fileName);
    }

    @Override
    public void delete() {
        System.out.println("Xóa video: " + fileName);
    }
}

