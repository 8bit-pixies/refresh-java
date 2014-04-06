Functions (or Methods)
======================

Functions are important part of any program. Here is an
example of a simple function which takes a string
and prints it. (Note in Java this is normally called a "method")

~~~{.java}
// simplePrint java program
// simple function example

public class simplePrint {
    public static void pprint(String s) {
        // a void method that just prints a string
        System.out.println("This is a string: " + s);
    }
    
    public static void main(String[] args) {    
        String ex = new String("test");        
        pprint(ex);
        pprint("a");
    }
}

~~~

Since the function doesn't return anything we have to give it a 
return type of "void". The rest of the function is extremely
similar to Python.

### Overloading

Methods can be overloaded. You can define two methods with the **same**
name, but with different types, and it will run as expected.

For example, altering the program above to do something else for `int`
types, we can see:

~~~{.java}
public class overloadPrint {
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
~~~

