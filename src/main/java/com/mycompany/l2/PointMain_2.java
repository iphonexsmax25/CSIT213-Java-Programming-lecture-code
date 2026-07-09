/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l2;

/**
 *
 * @author limis
 */
public class PointMain_2 {
    public static void main(String[] argv){
       
        comparePoint();
        
    }
    public static void comparePoint(){
    Point p1 =new Point(10,10);
    Point p2 =new Point(10,10);
    Point p3 = p2;
    // Comparing Point instances 
    System.out.println(p1 == p2);//flas
    System.out.println(p2 == p3);
    
}
}
