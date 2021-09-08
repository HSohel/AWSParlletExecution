package final_practice;

import java.text.ParseException;
import java.util.Arrays;

public class Main {

    public static void main (String [] args) throws ParseException {
        ArrayPractice arrayPractice=new ArrayPractice();
        arrayPractice.
        //MountainBike mountainbike=new MountainBike(4,100,5);
        //System.out.println(mountainbike.toString());

        Encapsulation encapsulation=new Encapsulation();
        encapsulation.setAge(17);
        encapsulation.setName("Sohel");
        encapsulation.setRoll(51);

        System.out.println(encapsulation.getAge());
        System.out.println(encapsulation.getName());
        System.out.println(encapsulation.getRoll());

    }
}
