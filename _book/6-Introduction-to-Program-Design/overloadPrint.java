// overloadPrint java program
// overload example

public class overloadPrint {
    // a void method that just prints a string
    public static void pprint(String s) {
        System.out.println("This is a string: " + s);
    }
    
    public static void pprint(int s) {
        System.out.println("We 'found' an int!");
    }
    
    public static void main(String[] args) {    
        String ex = new String("test");        
        pprint(ex);
        pprint("a");
        pprint(2);
    }
}
