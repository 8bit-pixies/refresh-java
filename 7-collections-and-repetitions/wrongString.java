//wrongString demonstrates the wrong way to 
//compare string values

public class wrongString {
    public static void main(String[] args) {
        String a = new String("test");
        String b = new String("test");
        
        if (a == b) {
            System.out.println("Equal!");
        }
        else {
            System.out.println("Not Equal!");
        }
    }
}


