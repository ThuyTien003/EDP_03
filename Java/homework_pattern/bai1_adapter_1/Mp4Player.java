package bai1_adapter_1;

public class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        // Không hỗ trợ
    }
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}
