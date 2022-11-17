public class MusicAdapter implements MusicPlayer {
    private AdvancedMediaPlayer media;

    public MusicAdapter(AdvancedMediaPlayer m) {
        media = m;
    }

    @Override
    public void playMusic(String audioType,String fileName) {
        System.out.print("Using Adapter --> ");
        media.playVlcPlayer(fileName);
        media.playMp4Player(fileName);
    }

}

