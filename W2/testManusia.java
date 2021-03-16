/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.menungso;

/**
 *
 * @author asus
 */
public class testManusia {
    public static void main(String[] args){
        Menungso man1 = new Menungso("Erik");
        System.out.println(man1.MyName());
        man1.buyTV();
        man1.sellallTV();
    }
}

