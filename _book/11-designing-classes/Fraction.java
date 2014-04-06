// Fractions

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



