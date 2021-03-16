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
class Menungso {
    String name;
    boolean punyaTV;
    
    Menungso(){
        
    }
    public Menungso(String name){
        this.name = name;
    }
    public String MyName(){
        return name;
    }
    void buyTV(){
        punyaTV = true;
        System.out.println(punyaTV);
    }
    void sellallTV(){
        punyaTV = false;
        System.out.println(punyaTV);
    }
    boolean okTV(){
        return punyaTV;
    }
    
}
