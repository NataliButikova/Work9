package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldGetStation() {
        Radio number = new Radio(10);

        Assertions.assertEquals(0, number.getMinStation());
        Assertions.assertEquals(9, number.getMaxStation());
        Assertions.assertEquals(0, number.getCurrentStation());
    }

    @Test
    public void shouldCurrentStation() {
        Radio number = new Radio(10);
        number.setCurrentStation(9);

        int expected = 9;
        int actual = number.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio number = new Radio(10);

        number.NextStation();

        int expected = 1;
        int actual = number.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationAboveMax() {
        Radio number = new Radio(10);
        number.setCurrentStation(10);

        int expected = 0;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldCurrentVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.NextVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAboveMax() {
        Radio number = new Radio(10);
        number.setCurrentStation(9);
        number.NextStation();

        int expected = 0;
        int actual = number.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        volume.NextVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumberBelowMin() {
        Radio number = new Radio(10);
        number.setCurrentStation(0);

        number.PrevStation();

        int expected = 9;
        int actual = number.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio number = new Radio(10);
        number.setCurrentStation(5);

        number.PrevStation();

        int expected = 4;
        int actual = number.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.PrevVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolumeBelowMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.PrevVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

