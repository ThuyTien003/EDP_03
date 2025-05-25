package bai2_bridge_2;

public class PDFDocument extends Document {
    public PDFDocument(Renderer renderer) {
        super(renderer);
    }

    public void display() {
        renderer.render("PDF content");
    }
}
