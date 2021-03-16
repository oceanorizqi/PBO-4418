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
public class TV {
    int channel = 1;
    int volumelvl = 1;
    boolean on = false;
    
    public TV(){
    }
        public void power(){
            on = true;
        }
        public void setCh (int newCh){
            if (on && newCh >= 1 && newCh <= 120)
                channel = newCh;
        }
        public void setVol (int newVolvl) {
            if (on && newVolvl >= 1 && newVolvl <= 7)
                volumelvl = newVolvl;
        }
        public void chUp(){
            if (on && channel < 100)
                channel++;
        }
        public void chDown(){
            if (on && channel > 1)
                channel--;
        }
        public void vUp(){
            if (on && volumelvl < 10)
                volumelvl++;
        }
        public void vDown(){
            if (on && volumelvl > 1)
                volumelvl--;
        }
    
}
