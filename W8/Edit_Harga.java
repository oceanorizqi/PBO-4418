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
import java.util.Scanner;

class Edit_Harga extends Get_datamobil{
    Scanner input1 = new Scanner(System.in);
    public void ubah(){
        System.out.println("Semua karyawan=");
        for(int i=0; i < Urus.size(); i++){
            int x = i+1;
            System.out.println(x+". "+Urus.get(i).get(0));
        }
        System.out.print("\nPilih siapa yang ingin mengubah harga dengan menyantumkan angka: ");
        int plh = input1.nextInt();
        System.out.println("\n1. Sedan, 2.MiniBus, 3.Bus ");
        int plh2 = input1.nextInt();
        if (plh2==1){
            super.get_sedan();
            System.out.println(Urus.get(plh-1).get(0)+" Ingin mengubah harga sedan");
            System.out.print("\nMasukkan nomor data (angka) untuk mengubah harga: ");
            int plh3 = input1.nextInt();
            System.out.println("Type Mobil: "+Sedan.get(plh3-1).get(0));
            System.out.println("Warna     : "+Sedan.get(plh3-1).get(1));
            System.out.println("Harga awal    : "+Sedan.get(plh3-1).get(2));
            System.out.print("\nMenjadi: ");
            harga = input1.nextLine();
            Sedan.get(plh3-1).set(2, harga);
            System.out.println("Harga akhir    : "+Sedan.get(plh3-1).get(2));
        }
        else if (plh2==2){
            super.get_minibus();
            System.out.println(Urus.get(plh-1).get(0)+" Ingin mengubah harga Minibus");
            System.out.print("\nMasukkan nomor data (angka) untuk mengubah harga: ");
            int plh3 = input1.nextInt();
            System.out.println("Type Mobil: "+Minibus.get(plh3-1).get(0));
            System.out.println("Warna     : "+Minibus.get(plh3-1).get(1));
            System.out.println("Harga awal    : "+Minibus.get(plh3-1).get(2));
            System.out.print("\nMenjadi: ");
            harga = input1.nextLine();
            Minibus.get(plh3-1).set(2, harga);
            System.out.println("Harga akhir    : "+Minibus.get(plh3-1).get(2));
        }
        else if (plh2==3){
            super.get_bus();
            System.out.println(Urus.get(plh-1).get(0)+" Ingin mengubah harga Bus");
            System.out.print("\nMasukkan nomor data (angka) untuk mengubah harga: ");
            int plh3 = input1.nextInt();
            System.out.println("Type Mobil: "+Bus.get(plh3-1).get(0));
            System.out.println("Warna     : "+Bus.get(plh3-1).get(1));
            System.out.println("Harga awal    : "+Bus.get(plh3-1).get(2));
            System.out.print("\nMenjadi: ");
            harga = input1.nextLine();
            Bus.get(plh3-1).set(2, harga);
            System.out.println("Harga akhir    : "+Bus.get(plh3-1).get(2));
        }               
    }
}
