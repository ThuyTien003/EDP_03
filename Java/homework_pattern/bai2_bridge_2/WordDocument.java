package bai2_bridge_2;

public class WordDocument extends Document {
    public WordDocument(Renderer renderer) {
        super(renderer);
    }

    public void display() {
        renderer.render("Word content");
    }
}
