//age group program which takes into a numeric argument
//and says what age group they are in

public class ageGroup {
    public static void main (String[] args) {
        int age;
        age = Integer.parseInt(args[0]);
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
}