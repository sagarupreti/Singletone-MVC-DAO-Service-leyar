/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.practice6.util;

/**
 *
 * @author ideapad-520S
 */
public class Calculator {
    private static Calculator calc=null;
    private double x,y;
    
    private Calculator(){
        System.out.println("I got Initialized");
        
    }
    
    public static Calculator getInstance(){
        if(calc==null){
        calc = new Calculator();
        }
           return calc; 
        
    }
        
    public double add(){
        return x+y;
        
    }
    
    public double sub(){
        return x-y;
    }
    
     public void stex(double x){
          this.x=x;
         
    }
     
     public void stey(double y){
          this.y=y;
     }

    
}

