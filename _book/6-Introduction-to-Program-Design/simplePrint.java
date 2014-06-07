// simplePrint java program
// simple function example

public class simplePrint {
    // a void method that just prints a string
    public static void pprint(String s) {
        System.out.println("This is a string: " + s);
    }
    
    public static void main(String[] args) {    
        String ex = new String("test");        
        pprint(ex);
        pprint("a");
    }
}
