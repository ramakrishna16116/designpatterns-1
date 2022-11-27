package com.company;

import static org.junit.jupiter.api.Assertions.*;

class Mp4PlayerTest {

    @org.junit.jupiter.api.Test
    void playVlcPlayer() {
        assertEquals("vlc", "vlc");
    }

    @org.junit.jupiter.api.Test
    void playMp4Player() {
        assertEquals("Mp4", "Mp4");

    }
}