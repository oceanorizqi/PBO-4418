/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.issacar;

/**
 *
 * @author asus
 */
public class mobilDemo {
    public static void main(String[] args){
        mobil Mobil1 = new mobil();
        Mobil1.kondisimesin();
        Mobil1.girUp();
        Mobil1.girUp();
        Mobil1.girUp();
        Mobil1.girUp();
        Mobil1.girDown();
        System.out.println("Kondisi mesin(true : hidup,false : mati) : " + Mobil1.mesin + ", Posisi gir mobil : " + Mobil1.Gir);
        mobil Mobil2 = new mobil();
        Mobil2.girUp();
        System.out.println("Kondisi mesin(true : hidup,false : mati) : " + Mobil2.mesin + ", Posisi gir mobil : " + Mobil2.Gir);
    }
}
