
package com.mycompany.l2;


public class Point {
    private double x, y;
    public Point(){
        
    }
    
    public Point(double xCoord, double yCoord){
        x = xCoord;
        y = yCoord;
    }
    
    public String toString(){
        return String.format("(%.1f,  %.1f)", x, y);
    }
    
}
