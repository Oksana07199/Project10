import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.Project10.service.Radio;

public class RadioTest {

    @Test
    public void checkBoundaryValue8() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ 8
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void checkBoundaryValue9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.increaseRadiostation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void checkBoundaryValue10() {   //ГРАНИЧНЫЕ ЗНАЧЕНИЯ 10
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void RadiostationOnIncrease() { //увеличение (гран.знач 1)
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.increaseRadiostation();
        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void checkLowerBound0() {  //ГРАНИЧНЫЕ ЗНАЧЕНИЯ 0
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkLowerBoundNegative() {   //ГРАНИЧНЫЕ ЗНАЧЕНИЯ -1
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void chooseRadiostation() {  //выбор станции
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        int expected = 3;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void PrevRightBorder() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void RadiostationOnDecrease() { //уменьшение радиостанции
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.decreaseRadiostation();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void RadiostationOnDecreaseMin() {   //станц на уменьш
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.decreaseRadiostation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeOnIncreaseMax() { //громкость при макс увелич
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
   public void checkVolumeOnIncrease() {
       Radio radio = new Radio();
        radio.setCurrentVolume(40);
        radio.increaseVolume();
        int expected = 41;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkVolumeOnDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(35);
        radio.decreaseVolume();
        int expected = 34;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkVolumeOnDecreaseMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void chooseVolumeBoundary() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void VolumeBoundaryNegative() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkVolumeOnIncreaseBoundary() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}