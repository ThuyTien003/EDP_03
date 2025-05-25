package bai1_adapter_1;

public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }
    public void playMp4(String fileName) {
        // Không hỗ trợ
    }
}



