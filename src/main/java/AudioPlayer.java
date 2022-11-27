package com.company;

public class AudioPlayer implements MusicPlayer {
    Adapter musicAdapter;

    @Override
    public void playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            musicAdapter = new Adapter(audioType);
            musicAdapter.playMusic(audioType, fileName);
        }else {
            System.out.println("Audio type not supported for the file: " + fileName);
        }
    }
}
