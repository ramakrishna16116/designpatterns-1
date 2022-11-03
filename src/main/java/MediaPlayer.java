public class MediaPlayer implements MusicPlayer {
    MusicAdapter musicAdapter = new MusicAdapter();

    @Override
    public String playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            return "Playing mp3 file: " + fileName;
        } else {
            return musicAdapter.playMusic(audioType, fileName);
        }
    }
}