/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testsimplecircle;

/**
 *
 * @author asus
 */
public class testSimpleCircle {
    //main
    public static void main(String[] args){
        SimpleCircle mcircle = new SimpleCircle(24);
        System.out.println(mcircle.radius + " Area Is " + mcircle.areaGet());
    }
}
class SimpleCircle{
    double radius = 0;
    SimpleCircle(double newRadius){
        radius = newRadius;
    }
    double areaGet(){
        return radius * radius * Math.PI;
    }
    double perimeterSet(){
        return 2 * radius * Math.PI;
    }
}