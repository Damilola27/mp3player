package practice;

public class Television {


    private boolean on;
    private int channel;
    private int volume;
    private boolean mute;

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public void setChannel(int channel) {
        if (channel > 0 && channel < 16) {
            this.channel = channel;
        }
    }

    public int getChannel() {
        return channel;
    }

    public void nextChannel() {
        if(channel < 16){
            channel = channel + 1;
        }
        if(channel == 16) {
            channel = 1;
        }
    }

    public void previousChannel() {
        if(channel > 0) {
            channel = channel - 1;
        }

        if(channel == 0) {
            channel = 15;
        }

    }


    public void setVolume(int volume) {
        if( volume > 0 && volume <= 6) {
            this.volume = volume;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if(volume < 6){
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if(volume < 6){
            volume = volume - 1;
        }
        if(volume < 0){
            volume = 0;
        }
    }


    public void setMute() {
        mute =! mute;

    }

    public boolean isMute() {
        return mute;
    }
}
