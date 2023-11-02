import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.Project10.service.Radio;

public class RadioTest {
    @Test
    public void VolumeIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(20);
        radio.increaseVolume();
        int expected = 21;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void VolumeDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(35);
        radio.decreaseVolume();
        int expected = 34;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void StationIncrease() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.increaseRadioStation();
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationDecrease() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.decreaseRadioStation();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void chooseStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        int expected = 3;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void VolumeIncreaseMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void VolumeDecreaseMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationIncreaseMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.increaseRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationDecreaseMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.decreaseRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void StationBoundary() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void VolumeBoundary() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void StationBoundaryNegative() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(- 1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void VolumeBoundaryNegative() {
        Radio radio = new Radio();
        radio.setCurrentVolume(- 1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeIncreaseBoundary() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void quantityTest() {
        Radio radio = new Radio(30);
        Assertions.assertEquals(30,radio.getQuantityRadioStation());
    }
    @Test
    public void chooseMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.getMaxNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void chooseMinStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getMinNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void MaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void MinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(expected, actual);
    }
}