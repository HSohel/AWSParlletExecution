package final_practice;


import javax.swing.event.TreeSelectionEvent;
import java.lang.invoke.SwitchPoint;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Collections;

public class ArrayPractice {

    int x;

    //public ArrayPractice(int i) {
       // x = i;
    //}

    public void learnArray() {

        String[] states = {"New York", "New Jersey", "Pennsylvania", "Virginia", "Texas"};

        List<String> list = new ArrayList<>();
        for (String state : states) {
            list.add(state);

        }
        System.out.println(list);

    }


    public void learnList() {

        List<String> myList = new ArrayList<>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");

        String[] myArray = myList.toArray(new String[myList.size()]);
        System.out.println(Arrays.toString(myArray));
        myList.set(2, "Five");
        System.out.println(myList.get(2));

    }


    public void switchStatement() {

        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Better you try again");
                break;
            default:
                System.out.println("Invalid grade");
        }

        System.out.println("Actual grade is " + grade);

    }


    public void ternaryOperator() {

        int a, b;
        a = 10;
        b = (a == 10) ? 20 : 30;
        System.out.println(b);

        String str = "JavaPoint";
        String c = str.substring(4, 9);
        System.out.println(c);

    }


    public void hashMap() {

        HashMap<String, String> hmap = new HashMap();
        hmap.put("ie", "internet Explorer");
        hmap.put("Mozilla", "Mozilla Firefox");
        hmap.put("Safari", "Safari Browser");


        for (Map.Entry map : hmap.entrySet()) {
            System.out.println("key name " + map.getKey() + " and value is " + map.getValue());
        }

        hmap.replace("ie", "internet Explorer browser");

    }

    public void scanner() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name here:");
        String s = in.nextLine();
        System.out.println("Name is :" + s);

    }

    public void swapNumbers() {

        int x = 11;
        int y = 12;
        int t = x;
        x = y;
        y = t;

        System.out.println("value of x : " + x + " value of y :" + y);


    }

    public void ForEach() {

        Integer[] marks = {33, 34, 67, 80, 89, 97};

        int highest_marks = Collections.max(Arrays.asList(marks));
        int lowestMarks = Collections.min(Arrays.asList(marks));

        System.out.println("Highest mark is " + highest_marks);
        System.out.println("Lowest mark is " + lowestMarks);


    }


    public void sorting() {

        Integer[] marks = {33, 34, 67, 80, 89, 97};

        Arrays.sort(marks);
        System.out.println("Minimum mark is " + marks[0]);
        Arrays.sort(marks, Collections.reverseOrder());
        System.out.println("Maximum mark is " + marks[0]);

        System.out.println(Arrays.toString(marks));
    }

    public void duplicateElement() {
        String str = "W3SchoolS";
        char[] inp = str.toCharArray();
        List<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int x = i + 1; x < str.length(); x++) {
                if (inp[i] == inp[x]) {
                    System.out.println(inp[x]);
                    chars.add(inp[x]);
                    break;
                }
            }
        }
        System.out.println(chars);
    }


    public void stringFunction() {

        String str = "JavaPoint";

        int str1 = str.indexOf('P', 2);
        System.out.println(str1);
    }

    public void Reverse() {

        String input = "I live in New York";

        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println(input1);

        String[] inputArray = input.split(" ");
        String reverse = "";
        for (int j = inputArray.length - 1; j >= 0; j--) {
            reverse += inputArray[j] + " ";
        }
        System.out.println(reverse);
    }

    public void RandomNumber() {
        Random rand = new Random();
        int rand1 = rand.nextInt(10000);
        int rand2 = rand.nextInt(10000);

        System.out.println(rand1);
        System.out.println(rand2);


        double rand3 = rand.nextDouble();
        double rand4 = rand.nextDouble();

        System.out.println(rand3);
        System.out.println(rand4);

        System.out.println(Math.round(12.75));
        System.out.println(Math.max(12, 15));


    }

    public void dateFormat() throws ParseException {
        Date date = new Date();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/dd/MM HH:mm:ss");
        //Date d=sdf.parse("2010/12/08");
        //sdf.applyPattern("MM/dd/yyyy");
        //System.out.println(sdf.format(d));
        System.out.println(sdf.format(date));

    }


    public static int getRandomInRange(int start, int end) {
        Random rand = new Random();
        return start + rand.nextInt(52 - 0 + 1);

    }

    //i want to generate list of 5 random numbers between 20 and 100.Here is my code

    public void RandomNumbers() {
        Random rand = new Random();
        List<Integer> list = new ArrayList();
        for (int i = 1; i < 52; i++) {
            int rand1 = rand.nextInt(52);    //Generate random numbers until 52
            list.add(rand1);                     // put all the numbers in List
        }
        System.out.println(list);                    // Print the list
    }


    //This will generate 5 random numbers between 20 and 100 inclusive.
    public void randomNumbersInRange() {
        for (int i = 0; i < 5; i++) {
            System.out.println(20 + (int) (Math.random() * ((100 - 20) + 1)));
        }
    }


    //This will generate 5 random numbers between 20 and 100 inclusive.
    public void hashmap() {
        HashMap<String, String> hmap = new HashMap();

        hmap.put("ie", "internet explorer");
        hmap.put("ie", "internet explorer");
        hmap.put("chrome", "chrome browser");
        hmap.put("Safari", "safari Browser");
        hmap.put("Firefox", "FirefoxBrowser");

        System.out.println(hmap.get("ie"));

        System.out.println(hmap.size());
        System.out.println(hmap.entrySet());
        System.out.println(hmap.keySet());


        for (Map.Entry map : hmap.entrySet()) {
            // System.out.println(map.getKey()+"---"+map.getValue());

        }
    }

    public void ScannerMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name here: ");
        String s = sc.nextLine();
        System.out.println("My name is :" + s);
    }

    public void maximumMarks() {

        Integer[] marks = {33, 36, 40, 80, 90};
        int highestMarks=Collections.max(Arrays.asList(marks));
        System.out.println(highestMarks);

    }
}




