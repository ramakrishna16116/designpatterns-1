public class AudioPlayer implements MusicPlayer {
    @Override
    public String playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            return "Playing mp3 file: " + fileName;
        } else {
            return "Audio type not supported for the file: " + fileName;
        }
    }
}