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
public class mobil {
    int Gir;
    boolean mesin = false;
    
    public mobil(){
    }
        public void kondisimesin(){
            mesin = true;
        }
        public void girUp(){
            if(mesin && Gir < 6)
                Gir++;
        }
        public void girDown(){
            if(mesin && Gir > 1)
                Gir--;
        }
}