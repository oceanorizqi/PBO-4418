/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngoding.w8kelompok;

/**
 *
 * @author asus
 */
public class Get_datamobil extends Set_mobiljual{
    public void get_sedan(){
        System.out.println(Sedan);
        System.out.println("\nCetak data mobil sedan");
        System.out.println("_____________________________");
            
        for(int i=0; i < Sedan.size(); i++){
            int x = i+1;

            System.out.println("Data ke-"+ x);
            System.out.println("Type Mobil: "+Sedan.get(i).get(0));
            System.out.println("Warna     : "+Sedan.get(i).get(1));
            System.out.println("Harga     : "+Sedan.get(i).get(2));
            System.out.println("");
        }
    }    

    public void get_minibus(){
        System.out.println(Minibus);
        System.out.println("\nCetak data mobil Minibus");
        System.out.println("_____________________________");
            
        for(int i=0; i < Minibus.size(); i++){
            int x = i+1;

            System.out.println("Data ke-"+ x);
            System.out.println("Type Mobil: "+Minibus.get(i).get(0));
            System.out.println("Warna     : "+Minibus.get(i).get(1));
            System.out.println("Harga     : "+Minibus.get(i).get(2));
            System.out.println("");
        }
    }  

    public void get_bus(){
        System.out.println(Bus);
        System.out.println("\nCetak data mobil Bus");
        System.out.println("_____________________________");
            
        for(int i=0; i < Bus.size(); i++){
            int x = i+1;

            System.out.println("Data ke-"+ x);
            System.out.println("Type Mobil: "+Bus.get(i).get(0));
            System.out.println("Warna     : "+Bus.get(i).get(1));
            System.out.println("Harga     : "+Bus.get(i).get(2));
            System.out.println("");
        }
    }

    public void get_data(){
        get_sedan();
        get_minibus();
        get_bus();
    }
}
