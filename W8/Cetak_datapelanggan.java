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
class Cetak_datapelanggan extends Set_idkonsumen {
    public void cetak(){
            System.out.println("\nCetak semua data");
            System.out.println("_____________________________");
            
        for(int i=0; i < Pelanggan.size(); i++){
            int x = i+1;
            System.out.println("Data ke-"+ x);
            System.out.println("Nama     : "+Pelanggan.get(i).get(0));
            System.out.println("Umur     : "+Pelanggan.get(i).get(1));
            System.out.println("ID       : "+Pelanggan.get(i).get(2));
            System.out.println("");           
        }
    }
}
