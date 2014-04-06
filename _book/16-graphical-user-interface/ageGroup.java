import javax.swing.*;

public class ageGroup {

    public static String printAge(int age) {
        if (age < 13) {
            return "Child";
        }
        else if (age <= 19) {
            return "Teenager";
        }
        else if (age < 65) {
            return "Adult";
        }
        else {
            return "Pensioner";
        }
    }

    public static void main (String[] args) {
        String getAge;
        Integer age;
        
        getAge = JOptionPane.showInputDialog("Enter your age");
        age = new Integer(getAge);
        
        JOptionPane.showMessageDialog(null, "You are a " + printAge(age));
    }
}
