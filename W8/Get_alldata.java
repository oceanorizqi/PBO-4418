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
class Get_alldata extends DealerMobil{
    public void cetak(){
        System.out.println("******************************");
        System.out.println("\nCetak semua data");
        System.out.println("*******************************");
            
        for(int i=0; i < Pelanggan.size(); i++){
            if(Pelanggan.get(i).size()>5){
                System.out.println("Data Pembelian");
                System.out.println("Nama     : "+Pelanggan.get(i).get(1));
                System.out.println("Umur     : "+Pelanggan.get(i).get(0));
                System.out.println("ID       : "+Pelanggan.get(i).get(2));}
            //     int x=3;
            //     System.out.println("Kendaraan yang dibeli:");
            //     for(int j=0; j < Pelanggan.size(); j++){
            //         int y = x;
            //         System.out.println("\nType Mobil: "+Pelanggan.get(j).get(3));
            //         System.out.println("Warna     : "+Pelanggan.get(j).get(4));
            //         System.out.println("Harga     : "+Pelanggan.get(j).get(5));
            //         x=x+3;
            //     }
            // }
            if(super.Pelanggan.get(i).size()<5){
                System.out.println("Data Pembeli");
                System.out.println("Nama     : "+super.Pelanggan.get(i).get(1));
                System.out.println("Umur     : "+super.Pelanggan.get(i).get(0));
                System.out.println("ID       : "+super.Pelanggan.get(i).get(2));
                // System.out.println("Harga     : "+Pelanggan.get(i).get(5));
            }
            System.out.println("");           
        }
    }
}
