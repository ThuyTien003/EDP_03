package bai2_bridge_2;

public class MarkdownDocument extends Document {
    public MarkdownDocument(Renderer renderer) {
        super(renderer);
    }

    public void display() {
        renderer.render("Markdown content");
    }
}
