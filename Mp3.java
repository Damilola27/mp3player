package practice;

public class Mp3 {

    private boolean on;
    private int numberOfMusic;
    private int music;
    private int volume;

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public void setNumberOfMusic(int numberOfMusic) {
        if (numberOfMusic >= 1 && numberOfMusic <= 50) {
            this.numberOfMusic = numberOfMusic;
        }
    }
    public int getNumberOfMusic() {
        return numberOfMusic;
    }

    public void setMusic(int music) {
        if(music > 0 && music <= numberOfMusic ) {
            this.music = music;
        }else {
            this.music = 1;
        }
    }

    public int getMusic() {
        return music;
    }

    public void nextMusic() {
        music = music + 1;
    }

    public void previousMusic() {
        music = music -1;
    }

    public void setVolume(int volume) {
        if(volume <= 10) {
            this.volume = volume;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if(volume < 10) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if( volume > 0 &&  volume<= 10){
            volume = volume - 1;
        }
    }
}
