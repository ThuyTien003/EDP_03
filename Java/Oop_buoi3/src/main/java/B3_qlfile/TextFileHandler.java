package B3_qlfile;

public class TextFileHandler extends FileHandler implements Compressible, Encryptable {

    public TextFileHandler(String fileName) {
        super(fileName);
    }

    @Override
    public void read() {
        System.out.println("Đọc file văn bản: " + fileName);
    }

    @Override
    public void write(String content) {
        System.out.println("Ghi vào file văn bản: " + fileName + ", nội dung: " + content);
    }

    @Override
    public void delete() {
        System.out.println("Xóa file văn bản: " + fileName);
    }

    @Override
    public void compress() {
        System.out.println("Nén file văn bản: " + fileName);
    }

    @Override
    public void encrypt() {
        System.out.println("Mã hóa file văn bản: " + fileName);
    }
}

