/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.televisi;

/**
 *
 * @author asus
 */
public class testTV {
    public static void main(String[] args){
        TV tv1 = new TV();
        tv1.power();
        tv1.setCh(98);
        tv1.setVol(6);
        
        TV tv2 = new TV();
        tv2.power();
        tv2.chUp();
        tv2.chUp();
        tv2.chUp();
        tv2.vUp();
        tv2.vUp();
        
        System.out.println("tv1's channel is "+ tv1.channel + " and volume lvl is " + tv1.volumelvl);
        System.out.println("tv2's channel is " + tv2.channel + " and volume lvl is " + tv2.volumelvl);
    }
}
