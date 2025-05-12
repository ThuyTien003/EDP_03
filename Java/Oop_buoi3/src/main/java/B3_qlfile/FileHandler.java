package B3_qlfile;

public abstract class FileHandler {
    protected String fileName;

    public FileHandler(String fileName) {
        this.fileName = fileName;
    }

    public abstract void read();
    public abstract void write(String content);
    public abstract void delete();
}

