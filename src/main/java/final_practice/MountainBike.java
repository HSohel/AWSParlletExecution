package final_practice;

public class MountainBike extends Bicycle {
    int SeatHeight;

    public MountainBike(int gear, int speed, int SeatHeight){
        super(gear, speed);
        this.SeatHeight=SeatHeight;
    }


    public void setHeight(int newValue){
        SeatHeight=newValue;

    }


    public String toString() {

    return (super.toString()+" SeatHeight is "+SeatHeight);
    }
}
