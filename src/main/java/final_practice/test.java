package final_practice;

import java.text.ParseException;

enum Day {
    SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
};


public class test {

    Day day;

    public test(Day day) {
        this.day = day;

    }


    public void dayIsLike(){
        switch (day){

            case MONDAY:
                System.out.println("Monday is fun day");
                break;

            case FRIDAY:
                System.out.println("Friday is good");
                break;

            case SATURDAY:
                System.out.println("Saturday is best");
                break;

            case SUNDAY:
                System.out.println("Sunday is for full rest");
                break;

            default:
                System.out.println("week days are so so");

        }


    }

    public static void main (String [] args) throws ParseException {
        //ArrayPractice arrayPractice=new ArrayPractice(4);
        test test1=new test(Day.MONDAY);
        test1.dayIsLike();

    }


}
