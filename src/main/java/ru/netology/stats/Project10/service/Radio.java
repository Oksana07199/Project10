package ru.netology.stats.Project10.service;

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int quantityStation = 10;
    private int maxNumberStation = 9;
    private int minNumberStation = 0;
    private int currentStation = minNumberStation;

    public Radio(int quantityRadioStation) {
        this.quantityStation = quantityRadioStation;
    }

    public Radio() {
    }

    public int getMaxNumberRadioStation() {

        return maxNumberStation;
    }

    public int getMinNumberRadioStation() {

        return minNumberStation;
    }

    public int getQuantityRadioStation() {
        return quantityStation;
    }

    public int getMaxVolume() {

        return maxVolume;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > quantityStation - 1) {
            return;
        }
        if (newCurrentRadioStation < minNumberStation) {
            return;
        }
        currentStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseRadioStation() {
        if (currentStation < quantityStation - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void decreaseRadioStation() {
        if (currentStation > minNumberStation) {
            currentStation = currentStation - 1;
        }
        if (currentStation == minNumberStation) {
            currentStation = 9;
        }
    }
}