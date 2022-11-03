public class MediaAdapter implements MusicPlayer {
    @Override
    public void playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else if(audioType.equalsIgnoreCase("mp4")){
            System.out.println("Playing mp4 file: " + fileName);
        } else if(audioType.equalsIgnoreCase("vlc")){
            System.out.println("Playing vlc file: " + fileName);
        } else{
            System.out.println("Audio type not supported for the file: " + fileName);
        }
    }
}