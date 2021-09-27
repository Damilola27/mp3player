package practice;

public class AirConditioner {



    private boolean on;
    private int temperature = 16;


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(on == false){
            temperature = 0;
        }else {
            if (temperature < 30) {
                temperature = temperature + 1;
            }
        }

    }

    public void decreaseTemperature() {
        if(on == false){
            temperature = 0;
        }else {
            if (temperature > 16) {
                temperature = temperature - 1;
            }
        }
    }
}







