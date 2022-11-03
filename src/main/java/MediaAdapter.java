public class MediaAdapter implements MusicPlayer, AdvancedMediaPlayer{

    private AdvancedMediaPlayer advancedMediaPlayer;
    private String audioType = "";

    public MediaAdapter(String audioType){
        this.audioType = audioType;
        //Select appropriate object depending on the type
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }
    @Override
    public String playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlcPlayer(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4Player(fileName);
        }
        return audioType;
    }

    @Override
    public void playVlcPlayer(String fileName) {
        if(audioType == "vlc"){
            advancedMediaPlayer.playVlcPlayer(fileName);
        }else{
            System.out.println("Wrong audio type");
        }
    }

    @Override
    public void playMp4Player(String fileName) {
        if(audioType == "mp4"){
            advancedMediaPlayer.playMp4Player(fileName);
        }else{
            System.out.println("Wrong audio type");
        }
    }
}
