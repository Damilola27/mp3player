package practice;

public class Bike {


    private boolean bikeOn;
    private int speed;

    public boolean isBikeOn() {
        return bikeOn;
    }

    public void setBikeOn(boolean bikeOn) {
        this.bikeOn = bikeOn;
    }

    int gear ;

    public void accelerate() {
        if(gear==1){
            speed = speed + 1;
        }
        if(gear==2){
            speed= speed + 2;
        }
        if(gear==3){
            speed= speed + 3;
        }
        if(gear==4){
            speed= speed + 4;
        }
    }


    public int getSpeed() {
        return speed;

    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public void setSpeed(int speed) {
        if(speed > 0 && speed <= 20){
            gear = 1;
        }
        if(speed > 21 && speed <= 30){
            gear = 2;
        }
        if( speed >31 && speed <=40){
            gear = 3;
        }
        if(speed> 41 ){
            gear = 4;
        }

        this.speed = speed;
    }

    public void decelerate() {
        if(gear==1){
            speed = speed - 1;
        }
        if(gear==2){
            speed= speed - 2;
        }
        if(gear==3){
            speed= speed - 3;
        }
        if(gear==4){
            speed= speed - 4;
        }
    }
}