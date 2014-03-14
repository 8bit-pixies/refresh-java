In Java, conditionals and boolean values work in the same way 
that you would expect.

So lets implement a simple program which does the following:

1. Takes a single argument (a persons age)
2. Determines whether the person is:
   * A child
   * A teenageer
   * An adult
   * Pensioner

(for now let us ignore wrong input)

In Python the program would look something like this:

~~~{.python}
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
~~~

In Java it looks quite similar:

~~~{.java}
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
~~~

Java also has a `switch` statement which will be ignored for now. 

Boolean statements work using `!`, `&&`, `||` instead of `not`, 
`and`, `or`. But otherwise works in exactly the same way.

Looping around loops
--------------------

Loops aren't as nice as Python. For example in Python, we can
use a loop to print out the numbers from one to 10. 

~~~{.python}
for x in range(10):
    print x+1
~~~

In Java it isn't so trivial. 

~~~{.java}
public class loop10 {
    public static void main (String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }
    }
}
~~~

So we see that we have to declare the index `i`, specify the condition
to break, and increment it. 

