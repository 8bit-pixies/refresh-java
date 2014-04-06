//rightString.java is the right way to compare strings

public class rightString {
    public static void main(String[] args) {
        String a = new String("test");
        String b = new String("test");
        
        if (a.equals(b)) {
            System.out.println("Equal!");
        }
        else {
            System.out.println("Not Equal!");
        }
    }
}

