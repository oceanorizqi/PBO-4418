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
import java.util.ArrayList;

class Set_mobiljual extends SetKaryawan {
    Set_mobiljual(){
    }

    public void inSedan(int b){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("\nMasukkan mobil sedan yang akan di jual");
        for(int i=0; i<b; i++){
            int z = Sedan.size();
            z+=1;
            System.out.println("Input ke-"+ z);
            System.out.print("Input Type mobil: ");
            typecar = input1.nextLine();
            System.out.print("Input warna mobil: ");
            warna = input2.nextLine();
            System.out.print("Input harga mobil: ");
            harga = input1.nextLine();
            int p = Sedan.size();
            Sedan.add(new ArrayList<String>());
            Sedan.get(p).add(0, typecar);
            Sedan.get(p).add(1, warna);
            Sedan.get(p).add(2, harga);
        }
    }

    public void inMinibus(int b){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("\nMasukkan minibus yang akan di jual");
        for(int i=0; i<b; i++){
            int z = Minibus.size();
            z+=1;
            System.out.println("Input ke-"+ z);
            System.out.print("Input Type mobil: ");
            typecar = input1.nextLine();
            System.out.print("Input warna mobil: ");
            warna = input2.nextLine();
            System.out.print("Input harga mobil: ");
            harga = input2.nextLine();
            int p = Minibus.size();
            Minibus.add(new ArrayList<String>());
            Minibus.get(p).add(0, typecar);
            Minibus.get(p).add(1, warna);
            Minibus.get(p).add(2, harga);
        }
    }

   public void inBus(int b){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
       System.out.println("\nMasukkan Bus yang akan di jual");
        for(int i=0; i<b; i++){
            int z = Bus.size();
            z+=1;
            System.out.println("Input ke-"+ z);
            System.out.print("Input Type mobil: ");
            typecar = input1.nextLine();
            System.out.print("Input warna mobil: ");
            warna = input2.nextLine();
            System.out.print("Input harga mobil: ");
            harga = input2.nextLine();
            int p = Bus.size();
            Bus.add(new ArrayList<String>());
            Bus.get(p).add(0, typecar);
            Bus.get(p).add(1, warna);
            Bus.get(p).add(2, harga);
        }
    }
}
