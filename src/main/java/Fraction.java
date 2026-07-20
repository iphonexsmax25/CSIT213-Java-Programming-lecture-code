public class Fraction {
    private int numerator, denominator;
    
    // ANew added
    void setNumerator(int nValue){
        numerator = nValue;
    }
    public Fraction add(Fraction other){
        int nValue = this.numerator * other.denominator + 
                     this.denominator * other.numerator;
        int dValue = this.denominator * other.denominator;
        
        //create an instance
        Fraction fsum = new Fraction(nValue, dValue); 
        fsum.simplify();
        return fsum;
    }
    
    private void simplify(){
        int startNum = 0;
        if (numerator < denominator){
            startNum = numerator;
        } else{
            startNum = denominator;
        }
        for(int divisor = startNum; divisor >= 2; divisor--){
            // % modulus
            if (numerator  % divisor == 0 && denominator % divisor == 0){
                numerator = numerator / divisor;
                denominator = denominator / divisor;
                break;
            }
            
        }
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
