public class Fraction {
    private int numerator, denominator;
    
    // Add FRaction with other variables
    public Fraction add(Fraction other){
        int nValue = this.numerator * other.denominator + 
                     this.denominator * other.numerator;
        int dValue = this.denominator * other.denominator;
        
        //create an instance
        Fraction fsum = new Fraction(nValue, dValue); 
        return fsum;
    }
    
    public Fraction(){
        denominator = 1;
    }
    public Fraction(int nValue, int dValue){
        numerator = nValue;
        denominator = dValue;
        if (denominator == 0){
            denominator = 1;
        }
    }
    // f2.equals(f3)
    public boolean equals(Object other){
        if (other == null)
            return false;
        if (other instanceof Fraction == false)
            return false;
        // Cast to Fraction
        Fraction otherFrac = (Fraction)other;
        int value1 = this.numerator * otherFrac.denominator;
        int value2 = otherFrac.numerator * this.denominator;
        return (value1 == value2);
    }
    public String toString(){
        return numerator + "/" + denominator;
    }
}
