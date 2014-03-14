Collections
===========

Collections are analogous to Python's list, tuples and dicts.
Collections include:  

*  Strings
*  Arrays
*  Lists
*  Sets
*  Dictionaries or Maps
*  Iterators

These are reference types and are actually objects (at least 
from my understanding). Which means they cannot be used in the
same way as the primitive types.

Strings
-------

`String` is **not** the same as Python strings! Lets take a 
quick look at something we would expect to work in Python
"translated" into Java.

~~~{.java}
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
~~~

Why does this happen! Well the reason is simply because `==`
tests for _reference_ equality while what we want is _value_ equality.

So lets look at the correct way:

~~~{.java}
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
~~~

We will use the `.equals` method in order to compare if strings
are the same.

What about comparing strings if they are "bigger" or "smaller"?
Simply use `compareTo` method.

~~~{.java}
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
~~~

Arrays
======

You can declare an array of "things" quite easily in Java. There 
really isn't a Python "version" of an array, though you can think of
an array as a list of fixed length and can only contain one variable
type.

~~~{.java}
public class intArray {
    public static void main(String[] args) {
        int[] numArr = {1,2,3,4};
        for (int i=0; i<4; i++) {
            System.out.println(numArr[i]);
        }
    }
}
~~~

You can also preallocate the array size and assign the values later.

~~~{.java}
public class intArrayFixed {
    public static void main(String[] args) {
        int[] numArr = new int[4];
        
        for (int i=0; i<4; i++) {
            numArr[i]=i+1; // indexing starts from 0
        }        
        for (int i=0; i<4; i++) {
            System.out.println(numArr[i]);
        }
    }
}
~~~

Maps (Dictionary)
-----------------

Python dictionaries are known as "maps" in Java. There are two
different maps that are in Java:

*  `HashMap`
*  `TreeMap`

Lets just look at the example below. 

~~~{.java}
import java.util.HashMap;
import java.util.Map;
import java.lang.Math;

public class simpleMap {
    public static void main(String[] args) {
        Map<String, Integer> names = new HashMap<String, Integer>();
        
        //associate a random age with each name
        for (int i=1; i<=10; i++) {
            String name = "name"+i;
            names.put(name, (int)(Math.random() * 10+1));
        }
        
        //print them all out, the keys and the values
        for (String key : names.keySet()) {
            System.out.println(key + " " + names.get(key));
        }
    }
}
~~~

We can see here, there are some things that may look familiar to
Python programmers.

Firstly, we now have the `import` statement. This works much in the 
same way as how Python has implemented it.

