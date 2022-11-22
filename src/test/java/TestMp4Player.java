import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class TestMp4Player {
    /* setUpStreams() and restoreStreams() are set up to test Console Output. Link is below
     * https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
     */
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testAudioPlayerMp3() {
        String output = "Playing mp3 file: song.mp3\n";
        String input0 = "mp3";
        String input1 = "song.mp3";
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.playMusic(input0, input1);
        assertEquals(output, outContent.toString());
    }

    @Test
    public void testAudioPlayerMp4() {
        String output = "Playing mp4 file: song.mp4\n";
        String input = "song.mp4";
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.playMusic(input);
        assertEquals(output, outContent.toString());
    }

    @Test
    public void testAudioPlayerVlc() {
        String output = "Playing vlc file: song.vlc\n";
        String input = "song.vlc";
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.playMusic(input);
        assertEquals(output, outContent.toString());
    }

    @Test
    public void testAudioPlayerWma() {
        String output = "Audio type not supported for the file: song.wma\n";
        String input0 = "wma";
        String input1 = "song.wma";
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.playMusic(input0, input1);
        assertEquals(output, outContent.toString());
    }
}
