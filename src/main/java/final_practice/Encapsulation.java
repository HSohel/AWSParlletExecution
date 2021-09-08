package final_practice;

public class Encapsulation {
    private int geekAge;
    private String geekName;
    private int geekRoll;


    public String getName() {
        return geekName;
    }

    public int getAge() {
        return geekAge;
    }

    public int getRoll() {
        return geekRoll;
    }

    public void setName(String NewName) {
        geekName = NewName;
    }

    public void setAge(int newAge) {
        geekAge = newAge;
    }

    public void setRoll(int newRoll) {
        geekRoll = newRoll;
    }


}
