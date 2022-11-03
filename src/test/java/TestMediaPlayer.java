import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestMediaPlayer {
    @Test
    public void test_playMP3() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        String fileType = "mp3";
        String fileName = "song1.mp3";

        String output = mediaPlayer.playMusic(fileType, fileName);

        Assert.assertEquals("Playing mp3 file: " + fileName, output);
    }

    @Test
    public void test_playMP4() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        String fileType = "mp4";
        String fileName = "song2.mp4";

        String output = mediaPlayer.playMusic(fileType, fileName);

        Assert.assertEquals("Playing mp4 file: " + fileName, output);
    }

    @Test
    public void test_playVLC() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        String fileType = "vlc";
        String fileName = "song3.vlc";

        String output = mediaPlayer.playMusic(fileType, fileName);

        Assert.assertEquals("Playing vlc file: " + fileName, output);
    }

    @Test
    public void test_playUnsupported() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        String fileType = "wma";
        String fileName = "song4.mp3";

        String output = mediaPlayer.playMusic(fileType, fileName);

        Assert.assertEquals("Unsupported file type for the file: " + fileName, output);
    }

}
