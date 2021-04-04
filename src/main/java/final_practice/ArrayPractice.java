package final_practice;


import javax.swing.event.TreeSelectionEvent;
import java.util.*;

public class ArrayPractice {

    public void learnArray() {

     String myString="I live in New York";
     String reverse="";
        String [] i=myString.split(" ");
        for (int x=i.length-1;x>=0;x--){
           reverse+=i[x]+" ";
        }
        System.out.println(reverse);
    }
 }

