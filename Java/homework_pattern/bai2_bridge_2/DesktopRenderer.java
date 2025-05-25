package bai2_bridge_2;

public class DesktopRenderer implements Renderer {
    public void render(String content) {
        System.out.println("[Desktop] Rendering: " + content);
    }
}
