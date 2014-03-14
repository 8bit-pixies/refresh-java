-   What is Java
-   Hello World
    -   Looping around loops
-   Data Types
-   Functions (or Methods)
    -   Overloading
-   Collections
    -   Strings
-   Arrays
    -   Maps (Dictionary)
-   Classes
    -   Overriding Methods
    -   `extends`
    -   `super`
    -   Overriding Methods
    -   `extends`
    -   `super`
-   Swing

What is Java
============

Java is an object-orientated programming language. It is probably the
most widely taught and popular programming language.

A few differences compared to python

1.  Every Java program must define a class, and all code must reside in
    this class.
2.  Statically typed! Everything must have a type.
3.  Must have the function: `public static void main(String[] args)`

Hello World
===========

If there is one thing constant in Java programs, then it is the
structure of a program. It is not the same as Python in which "Hello
World" can be simply written as:

``` {.python}
print "Hello World"
```

Rather in Java, there is a set structure

``` {.java}
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

To run it we have to make sure we do a few things:

1.  The file must be "Hello.java".
2.  We must first compile it by running `$ javac Hello.java`
3.  Then we can execute it by running `$ java Hello`

Remember in section 1 where I said everything in Java code must be in a
class? Well we just saw that in the previous section.

More on classes later in section 11. In Java, conditionals and boolean
values work in the same way that you would expect.

So lets implement a simple program which does the following:

1.  Takes a single argument (a persons age)
2.  Determines whether the person is:

-   A child
-   A teenageer
-   An adult
-   Pensioner

(for now let us ignore wrong input)

In Python the program would look something like this:

``` {.python}
import sys

age = int(sys.argv[1])

if age < 13:
    print "Child"
elif age <= 19:
    print "Teenager"
elif age < 65:
    print "Adult"
else:
    print "Pensioner"
```

In Java it looks quite similar:

``` {.java}
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
```

Java also has a `switch` statement which will be ignored for now.

Boolean statements work using `!`, `&&`, `||` instead of `not`, `and`,
`or`. But otherwise works in exactly the same way.

Looping around loops
--------------------

Loops aren't as nice as Python. For example in Python, we can use a loop
to print out the numbers from one to 10.

``` {.python}
for x in range(10):
    print x+1
```

In Java it isn't so trivial.

``` {.java}
public class loop10 {
    public static void main (String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }
    }
}
```

So we see that we have to declare the index `i`, specify the condition
to break, and increment it.

Data Types
==========

Remember how I said Java is statically typed? In fact, I have already
introduced this to you! In the previous section I initialised `age` by
typing `int age`. This is esentially what it means is that the type of a
variable is known at compile time.

Java only supports the primitive data type which are:

-   `int`
-   `float`
-   `double`
-   `char`
-   `boolean`

You will notice that there is no `string` type (`char` and `string`
types are different).

But! Java does have a `String` *reference* type (`string` with a capital
`S` and yes, it does make a difference). We will see more about it in
section 6.

There isn't too much to demonstrate here, as all these things will work
in the same way as Python.

Functions (or Methods)
======================

Functions are important part of any program. Here is an example of a
simple function which takes a string and prints it. (Note in Java this
is normally called a "method")

``` {.java}
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
```

Since the function doesn't return anything we have to give it a return
type of "void". The rest of the function is extremely similar to Python.

### Overloading

Methods can be overloaded. You can define two methods with the **same**
name, but with different types, and it will run as expected.

For example, altering the program above to do something else for `int`
types, we can see:

``` {.java}
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
```

Collections
===========

Collections are analogous to Python's list, tuples and dicts.
Collections include:

-   Strings
-   Arrays
-   Lists
-   Sets
-   Dictionaries or Maps
-   Iterators

These are reference types and are actually objects (at least from my
understanding). Which means they cannot be used in the same way as the
primitive types.

Strings
-------

`String` is **not** the same as Python strings! Lets take a quick look
at something we would expect to work in Python "translated" into Java.

``` {.java}
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
```

Why does this happen! Well the reason is simply because `==` tests for
*reference* equality while what we want is *value* equality.

So lets look at the correct way:

``` {.java}
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
```

We will use the `.equals` method in order to compare if strings are the
same.

What about comparing strings if they are "bigger" or "smaller"? Simply
use `compareTo` method.

``` {.java}
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
```

Arrays
======

You can declare an array of "things" quite easily in Java. There really
isn't a Python "version" of an array, though you can think of an array
as a list of fixed length and can only contain one variable type.

``` {.java}
public class intArray {
    public static void main(String[] args) {
        int[] numArr = {1,2,3,4};
        for (int i=0; i<4; i++) {
            System.out.println(numArr[i]);
        }
    }
}
```

You can also preallocate the array size and assign the values later.

``` {.java}
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
```

Maps (Dictionary)
-----------------

Python dictionaries are known as "maps" in Java. There are two different
maps that are in Java:

-   `HashMap`
-   `TreeMap`

Lets just look at the example below.

``` {.java}
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
```

We can see here, there are some things that may look familiar to Python
programmers.

Firstly, we now have the `import` statement. This works much in the same
way as how Python has implemented it.

Classes
=======

Classes in Java are unavoidable. Everything has to reside in a class!
But lets look at a more complex example, defining our own data type
being "Fractions".

``` {.java}
public class Fraction {
    // initialise!
    private Integer numerator;
    private Integer denominator;
    
    //constructor
    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public Fraction(Integer numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }
    
    //functions to just get the numerator/denominator
    public Integer getNumerator() {
        return numerator;
    }
    
    public Integer getDenominator() {
        return denominator;
    }
    
    // add some simple methods like addition, subtraction
    public Fraction add(Fraction f2) {
        Integer nNum, nDenom;
        nNum = f2.getDenominator()*numerator + denominator*f2.getNumerator();
        nDenom = denominator*f2.getDenominator();
        return new Fraction(nNum, nDenom);    
    }
    
    public Fraction add(Integer f1) {
        return add(new Fraction(f1));
    }
    
    
    // add a print method
    public static void printFraction(Fraction f) {
        System.out.println(f.numerator + "/" + f.denominator);
    }

    public static void main(String[] args) {    
        Fraction t1 = new Fraction(10);
        Fraction t2 = new Fraction(1,2);
        
        printFraction(t1.add(t2));
    }

}
```

Before diving in too deep, lets ask the question, why doesn't
`System.out.println(f.numerator);` work? The simple reason is that
`numerator` is `private`. In order to allow the `println` function to
work we would have to change it to `public`. This is designed to control
access to members in a class.

Lets take a moment to think about how inheritance is handled in other
programming languages. The typical example is using "Animals". In Python
this is accomplished by first defining a class, and then wrapping a sub
class underneath.

For example:

``` {.python}

class Animal(object):
    def __init__(self, name, species):
        self.name = name
        self.species = species
    def getName(self):
        self.name

    def getSpecies(self):
        self.species

    def __str__(self):
        return "%s is a %s" % (self.name, self.species)

def main():
    dog = Animal("Bob", "Dog")
    print dog

if __name__ == '__main__':
    main()

```

So then, to inherit, lets say we have a dog and want to add a breed:

``` {.python}

class Animal(object):
    def __init__(self, name, species):
        self.name = name
        self.species = species
    def getName(self):
        self.name

    def getSpecies(self):
        self.species

    def __str__(self):
        return "%s is a %s" % (self.name, self.species)

class Dog(Animal):

    def __init__(self, name, breed):
        Animal.__init__(self, name, "Dog")
        self.breed = breed

def main():
    muffins = Animal("Muffins", "Cat")
    dog = Dog("Bob", "Bulldog")
    print muffins
    print dog
    print dog.breed

if __name__ == '__main__':
    main()

```

And thats it! You now have some form of inheritance.

So in Java what would this look like?

``` {.java}

// animals

class Animal {
    private String name;
    private String species;
    
    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }
    
    @Override
    public String toString() {
        return name + " is a " + species;
    }
}

class Dog extends Animal {
    private String breed;
    
    public Dog(String name, String breed) {
        super(name, "Dog");
        this.breed = breed;
    }
    
    public void printBreed() {
        System.out.println(breed);
    }
}

public class printAnimal {

    public static void main(String[] args) {    
        Animal muffins = new Animal("Muffins", "Cat");        
        Dog bob = new Dog("Bob", "Bulldog");
        System.out.println(muffins);
        bob.printBreed();
    }
}
```

What are the differences that we see?

1.  Method overriding via `@Override`.
2.  Use of the word `extends`.
3.  Method `super`.

So lets go through briefly what each one of these things actually do.

### Overriding Methods

You can override methods in Java by using `@Override`. In Python this
was done through `__str__`.

### `extends`

This is the Java way of inheritance.

### `super`

This is the Java equivalent of this python line:

``` {.python}
Animal.__init__(self, name, "Dog")
```

It is where all the magic happens when it calls its super class to
"inherit" it.

Lets take a moment to think about how inheritance is handled in other
programming languages. The typical example is using "Animals". In Python
this is accomplished by first defining a class, and then wrapping a sub
class underneath.

For example:

``` {.python}

class Animal(object):
    def __init__(self, name, species):
        self.name = name
        self.species = species
    def getName(self):
        self.name

    def getSpecies(self):
        self.species

    def __str__(self):
        return "%s is a %s" % (self.name, self.species)

def main():
    dog = Animal("Bob", "Dog")
    print dog

if __name__ == '__main__':
    main()

```

So then, to inherit, lets say we have a dog and want to add a breed:

``` {.python}

class Animal(object):
    def __init__(self, name, species):
        self.name = name
        self.species = species
    def getName(self):
        self.name

    def getSpecies(self):
        self.species

    def __str__(self):
        return "%s is a %s" % (self.name, self.species)

class Dog(Animal):

    def __init__(self, name, breed):
        Animal.__init__(self, name, "Dog")
        self.breed = breed

def main():
    muffins = Animal("Muffins", "Cat")
    dog = Dog("Bob", "Bulldog")
    print muffins
    print dog
    print dog.breed

if __name__ == '__main__':
    main()

```

And thats it! You now have some form of inheritance.

So in Java what would this look like?

``` {.java}

// animals

class Animal {
    private String name;
    private String species;
    
    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }
    
    @Override
    public String toString() {
        return name + " is a " + species;
    }
}

class Dog extends Animal {
    private String breed;
    
    public Dog(String name, String breed) {
        super(name, "Dog");
        this.breed = breed;
    }
    
    public void printBreed() {
        System.out.println(breed);
    }
}

public class printAnimal {

    public static void main(String[] args) {    
        Animal muffins = new Animal("Muffins", "Cat");        
        Dog bob = new Dog("Bob", "Bulldog");
        System.out.println(muffins);
        bob.printBreed();
    }
}
```

What are the differences that we see?

1.  Method overriding via `@Override`.
2.  Use of the word `extends`.
3.  Method `super`.

So lets go through briefly what each one of these things actually do.

### Overriding Methods

You can override methods in Java by using `@Override`. In Python this
was done through `__str__`.

### `extends`

This is the Java way of inheritance.

### `super`

This is the Java equivalent of this python line:

``` {.python}
Animal.__init__(self, name, "Dog")
```

It is where all the magic happens when it calls its super class to
"inherit" it.

Looking at the previous example, we have just introduced the idea of
*polymorphism*. There are methods and attributes that are in the
subclass "Dog" which are not in animal, namely the method `printBreed()`
and the field `breed`. Abstract classes and interfaces are used in Java
to offer a structure of the class (and subclasses) without really saying
what it **must** do. So its like a skeleton, or outline to what is to
happen.

What are the differences between abstract classes and interfaces? In a
nutshell it could be framed like this:

> Abstract classes are *guidelines*, while interfaces are *rules*.

<!--
needs to be expanded
-->


Swing
=====

Swing is a nice easy way to create GUI for Java programs. You can use it
to accept input. So looking back at our example about getting a person's
age group:

``` {.java}

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
```

Now we want to add a dialog box to get our input.

``` {.java}

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

```
