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
class Get_datakaryawan extends SetKaryawan{
    public void cetak(){
        System.out.println(Urus);
        System.out.println("\nCetak semua data");
        System.out.println("_____________________________");
            
        for(int i=0; i < Urus.size(); i++){
            int x = i+1;

            System.out.println("Data ke-"+ x);
            System.out.println("Nama     : "+Urus.get(i).get(0));
            System.out.println("Umur     : "+Urus.get(i).get(1));
            System.out.println("ID Karyawan: "+Urus.get(i).get(2));
            System.out.println("");
            
        }
    }
}
