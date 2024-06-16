package ru.netology;

public class Radio {

    private int maxStation = 9; private int minStation = 0;
    private int currentStation = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio() {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = minVolume;
    }

    public Radio(int size) {
        maxStation = minStation + size - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void NextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else currentStation = minStation;
    }

    public void PrevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else currentStation = maxStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void NextVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else currentVolume = 0;
    }

    public void PrevVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}