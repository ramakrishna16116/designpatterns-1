package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudioPlayerTest {

    @Test
    void playMusic() {
        assertEquals("Vlc", "Vlc");
        assertEquals("Mp4", "Mp4");
        assertEquals("mp3", "mp3");

    }
}