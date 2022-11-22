public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;
    @Override
    public void playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        }
        else {
            System.out.println("Audio type not supported for the file: " + fileName);
        }
    }

    // playMusic() has to be overloaded with method containing only one parameter
    public void playMusic(String fileName) {
        // contain() checks if "vlc" is inside the String of fileName
        if(fileName.contains("vlc")) {
            mediaAdapter = new MediaAdapter("vlc");
            mediaAdapter.playMusic("vlc", fileName);
        }
        // contain() checks if "mp4" is inside the String of fileName
        else if(fileName.contains("mp4")) {
            mediaAdapter = new MediaAdapter("mp4");
            mediaAdapter.playMusic("mp4", fileName);
        }
        else;
    }
}