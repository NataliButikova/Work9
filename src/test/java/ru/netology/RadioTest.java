package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldCurrentStation() {
        Radio number = new Radio();
        number.setCurrentStation(7);
        int expected = 7;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationMax() {
        Radio number = new Radio();
        number.setCurrentStation(9);
        int expected = 9;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationBoundaryMax1() {
        Radio number = new Radio();
        number.setCurrentStation(10);
        int expected = 0;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationMax2() {
        Radio number = new Radio();
        number.setCurrentStation(15);
        int expected = 0;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationMin() {
        Radio number = new Radio();
        number.setCurrentStation(0);
        int expected = 0;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationMin1() {
        Radio number = new Radio();
        number.setCurrentStation(-7);
        int expected = 0;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationMin2() {
        Radio number = new Radio();
        number.setCurrentStation(-1);
        int expected = 0;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationBoundaryMin() {
        Radio number = new Radio();
        number.setCurrentStation(1);
        int expected = 1;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationBoundaryMax() {
        Radio number = new Radio();
        number.setCurrentStation(8);
        int expected = 8;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(55);
        int expected = 55;
        int actual = volume.getCurrentVolume();
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
    public void shouldCurrentVolumeMax1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(150);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeMax2() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeBoundaryMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);
        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeMin1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-50);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeMin2() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeBoundaryMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationNext() {
        Radio number = new Radio();
        number.setCurrentStation(7);

        number.nextStation();

        int expected = 8;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationNextMin1() {
        Radio number = new Radio();
        number.setCurrentStation(0);

        number.nextStation();

        int expected = 1;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationNextMin2() {
        Radio number = new Radio();
        number.setCurrentStation(1);

        number.nextStation();

        int expected = 2;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationNextMax1() {
        Radio number = new Radio();
        number.setCurrentStation(8);

        number.nextStation();

        int expected = 9;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationNextMax2() {
        Radio number = new Radio();
        number.setCurrentStation(9);

        number.nextStation();

        int expected = 0;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeNext() {
        Radio volume = new Radio();
        volume.setCurrentVolume(55);

        volume.nextVolume();

        int expected = 56;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeNextMin1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.nextVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeNextMin2() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        volume.nextVolume();

        int expected = 2;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeNextMax1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        volume.nextVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeNextMax3() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.nextVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldCurrentStationPrevMin1() {
        Radio number = new Radio();
        number.setCurrentStation(0);

        number.prevStation();

        int expected = 9;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationPrevMin2() {
        Radio number = new Radio();
        number.setCurrentStation(1);

        number.prevStation();

        int expected = 0;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void shouldCurrentStationPrevMax1() {
        Radio number = new Radio();
        number.setCurrentStation(9);

        number.prevStation();

        int expected = 8;
        int actual = number.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumePrevMax1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.prevVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumePrevMin1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.prevVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}

