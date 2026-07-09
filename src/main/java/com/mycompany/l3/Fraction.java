/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l3;

/**
 *
 * @author limis
 */
public class Fraction {
    private int numerator, denominator;
    
    
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
    public boolean equals(Fraction other){
        if (other == null)
            return false;
        if (other instanceof Fraction == false){
            return false;
        }
        // Cast ro Fraction 
        //otherFrac is a Fraction reference
        Fraction otherFrac = (Fraction)other;
        int value1 = numerator * otherFrac.denominator;
        int value2 = otherFrac.numerator * this.denominator;
         return(value1 == value2);
    }
    public String toString(){
        return numerator + "/" + denominator;
    }
}
