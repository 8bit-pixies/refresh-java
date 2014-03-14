Swing
=====

Swing is a nice easy way to create GUI for Java programs. You can use it to accept input.
So looking back at our example about getting a person's age group:

~~~{.java}

public class ageGroup {

    public static void printAge(int age) {
        if (age < 13) {
            System.out.println("Child");
        }
        else if (age <= 19) {
            System.out.println("Teenager");
        }
        else if (age < 65) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Pensioner");
        }
    }

    public static void main (String[] args) {
        int age;
        age = Integer.parseInt(args[0]);
        printAge(age);
    }
}

~~~

Now we want to add a dialog box to get our input.

~~~{.java}

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


~~~

