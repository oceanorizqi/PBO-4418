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
public class MotorVehicle extends Vehicle{
    int sizeofEngine = 2;
    String licencePlate = "H 1 IDN";
    
    
    public MotorVehicle(){
    }
    public MotorVehicle(int sizeofEngine, String licensePlate) {
        this.sizeofEngine = sizeofEngine;
        this.licencePlate = licensePlate;
    }
    public int getSizeofEngine (){
        return this.sizeofEngine;
    }
    public String getLicencePlate(){
        return this.licencePlate;
    }
}
