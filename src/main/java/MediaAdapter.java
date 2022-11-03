public class MediaAdapter implements MusicPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String mediaType) {
        if (mediaType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        } else if (mediaType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public String playMusic(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            return advancedMediaPlayer.playMp4Player(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            return advancedMediaPlayer.playVlcPlayer(fileName);
        }
        return fileName;
    }
}
