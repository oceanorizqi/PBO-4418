/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngoding.praktek;

/**
 *
 * @author asus
 */
public class Car extends MotorVehicle{
    boolean SeatBelt = false;
    
    public Car(){
    }
    public void setSeatBelt (int SeatBelt){
        if(SeatBelt >= 1){
            this.SeatBelt = true;
        }
        else if(SeatBelt < 1){
            this.SeatBelt = false;
        }
    }
    public boolean getSeatBelt(){
        return this.SeatBelt;
    }
}
