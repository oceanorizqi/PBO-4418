/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportasi;

/**
 *
 * @author asus
 */
import Transportasi.Sepeda;
import Transportasi.Mobil;
public class TransportasiDemo {
    public static void main(String[] args){
    Mobil toyota = new Mobil();
    Sepeda wimcycle = new Sepeda();
    System.out.println("--Mobil--");
    toyota.goStraight();
    toyota.turnLeft();
    System.out.println("--Sepeda--");
    wimcycle.goStraight();
    wimcycle.ringBell();
    }
    
}
