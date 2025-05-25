package bai2_bridge_2;

public class Main {
    public static void main(String[] args) {
        Renderer mobileRenderer = new MobileRenderer();
        Renderer desktopRenderer = new DesktopRenderer();

        Document doc1 = new PDFDocument(mobileRenderer);
        doc1.display();

        Document doc2 = new WordDocument(desktopRenderer);
        doc2.display();

        Document doc3 = new MarkdownDocument(mobileRenderer);
        doc3.display();
    }
}

