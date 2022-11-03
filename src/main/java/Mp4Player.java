public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public String playVlcPlayer(String fileName) {
        return "";
    }

    @Override
    public String playMp4Player(String fileName) {
       return ("Playing mp4 file: " + fileName);
    }
}
