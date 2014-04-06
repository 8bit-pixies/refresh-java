Classes
=======

Classes in Java are unavoidable. Everything has to reside in a class!
But lets look at a more complex example, defining our own data type
being "Fractions".

~~~{.java}
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
~~~

Before diving in too deep, lets ask the question, why doesn't `System.out.println(f.numerator);` work? The simple reason is that
`numerator` is `private`. In order to allow the `println` function to work
we would have to change it to `public`. This is designed to control access to
members in a class.

