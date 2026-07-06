
package com.mycompany.l2;


public class Point {
    private double x, y;
    public Point(){
        x = 1;
        y = 1; 
    }
    
    public Point(double xCoord, double yCoord){
        x = xCoord;
        y = yCoord;
    }
    
    public double getDistance(){
        return 0;
    }
    
    public String toString(){
        return String.format("(%.1f,  %.1f)", x, y);
    }
    
}
