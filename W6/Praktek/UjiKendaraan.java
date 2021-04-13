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
public class UjiKendaraan {
    public static void kendaraanmaju(Vehicle kendaraan){
        kendaraan.goStraight();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle sepeda = new Bicycle();
        MotorVehicle mtr = new MotorVehicle();
        MotorCycle sepedamotor = new MotorCycle();
        Car mobil = new Car();
        
        System.out.println(sepeda.speed);
        System.out.println(sepeda.color);
        sepeda.turnRight();
        sepeda.ringBell();
        
        
        System.out.println(mtr.speed);
        System.out.println(mtr.color);
        System.out.println(mtr.licencePlate);
        System.out.println(mtr.sizeofEngine);
        mtr.turnLeft();
        System.out.println(mtr.getLicencePlate());
        System.out.println(mtr.getSizeofEngine());
        System.out.println("------- PERTEMUAN 6 -------");
        System.out.println("Gir Sepeda Motor : " + sepedamotor.getGearFoot());
        mobil.setSeatBelt(3);
        System.out.println("Keadaan Sabuk Mobil (True = Terpasang,False = Tidak Terpasang) : " + mobil.getSeatBelt());
        System.out.println();
        kendaraanmaju(new Bicycle());
        kendaraanmaju(new Car());
        kendaraanmaju(new MotorCycle());
        kendaraanmaju(new MotorVehicle());
    }
}
