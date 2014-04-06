// orderString shows a way to compare whether strings are "bigger"
// or "smaller"

public class orderString {
    public static void main(String[] args) {
        String a = new String("a");
        String b = new String("b");
        
        int compare = a.compareTo(b);
        
        if (compare < 0) {
            System.out.println(a + " comes before " + b);
        }
        else if (compare == 0) {
            System.out.println(a + " is equal to " + b);
        }
        else { 
            System.out.println(a + " comes after " + b);
        }
    }
}
            