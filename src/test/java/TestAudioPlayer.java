import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestAudioPlayer {
    AudioPlayer audioPlayer;

    @Before
    public void setUp() {
         audioPlayer = new AudioPlayer();
    }

    @Test
    public void testPlayMusicMP3() {
        String expected = "Playing mp3 file: song1.mp3";
        String actual = audioPlayer.playMusic("mp3", "song1.mp3");
        assertEquals(expected, actual);
    }

    @Test
    public void testPlayMusicMP4() {
        String expected = "Playing mp4 file: song2.mp4";
        String actual = audioPlayer.playMusic("mp4", "song2.mp4");
        assertEquals(expected, actual);
    }

    @Test
    public void testPlayMusicVLC() {
        String expected = "Playing vlc file: song3.vlc";
        String actual = audioPlayer.playMusic("vlc", "song3.vlc");
        assertEquals(expected, actual);
    }

    @Test
    public void testPlayMusicUnsupported() {
        String expected = "Media file not supported: wma";
        String actual = audioPlayer.playMusic("wma", "song4.wma");
        assertEquals(expected, actual);
    }
}