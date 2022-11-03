public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public String playVlcPlayer(String fileName) {
        return "Playing vlc file: " + fileName;
    }

    @Override
    public String playMp4Player(String fileName) {
        return null;
    }
}
