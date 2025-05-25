package bai2_proxy_7;

public class SecureDocumentProxy implements Document{
    private RealDocument realDocument;
    private String filename;
    private String userRole;

    public SecureDocumentProxy(String filename, String userRole) {
        this.filename = filename;
        this.userRole = userRole;
    }

    @Override
    public void read() {
        if ("admin".equalsIgnoreCase(userRole)) {
            if (realDocument == null) {
                realDocument = new RealDocument(filename);
            }
            realDocument.read();
        } else {
            System.out.println("Truy cập bị từ chối. Chỉ admin mới được đọc file: " + filename);
        }
    }
}
