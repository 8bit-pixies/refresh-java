Hello World
===========

If there is one thing constant in Java programs,
then it is the structure of a program. It is not
the same as Python in which "Hello World" can
be simply written as:

~~~{.python}
print "Hello World"
~~~

Rather in Java, there is a set structure

~~~{.java}
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
~~~

To run it we have to make sure we do a few things:

1. The file must be "Hello.java". 
2. We must first compile it by running `$ javac Hello.java`
3. Then we can execute it by running `$ java Hello`

