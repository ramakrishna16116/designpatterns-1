public class AudioPlayer implements MusicPlayer {
    MediaAdapter mediaAdapter;
    
    @Override
    public String playMusic(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            return ("Playing mp3 file: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            return mediaAdapter.playMusic(audioType, fileName);
        } else if (audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            return mediaAdapter.playMusic(audioType, fileName);
        } else {
            return ("Media file not supported: " + audioType);
        }
    }
}