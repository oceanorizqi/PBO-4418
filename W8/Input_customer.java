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

class Input_customer extends Set_idkonsumen {
    Input_customer(){
    }

    public void data_pembelian(){
        int z = Pelanggan.size();
        z+=1;
        System.out.println("Input ke-"+ z);
        super.set_namakostumer();
        super.set_umur();
        super.set_id();

        int p = Pelanggan.size();
        Pelanggan.add(new ArrayList<String>());
        Pelanggan.get(p).add(0, umur);
        Pelanggan.get(p).add(1, nama);
        Pelanggan.get(p).add(2, noID);
        System.out.println("Silahkan masukan Pilihan:\n 1. Sedan, 2. Minibus, 3. Bus\n");
        Scanner input=new Scanner(System.in);
        System.out.println("Masukan pilihan anda sesuai dengan nomor menu: ");
        int jenis = input.nextInt();
        if (jenis==1){
            System.out.println("**************************************");
            System.out.println("\nData mobil Sedan yang dapat anda beli");
            System.out.println("**************************************");
            for(int i=0; i < Sedan.size(); i++){
                int x = i+1;
                System.out.println("Data ke-"+ x);
                System.out.println("Type-Mobil: "+Sedan.get(i).get(0));
                System.out.println("Warna     : "+Sedan.get(i).get(1));
                System.out.println("Harga     : "+Sedan.get(i).get(2));
                super.JmlHrg.add(Sedan.get(i).get(2));
                // super.Pelanggan.add(2,Sedan.get(0));
                // super.Pelanggan.add(3,Sedan.get(1));
                System.out.println("");
            }
            int i=0;
            while(i < 1){
                System.out.println("Pilih:\n 1. Tambah, 2. Stop");
                System.out.print("Masukan pilihan:");
                int ingin = input.nextInt();
                if(ingin==1){
                    System.out.print("Pilih sesuai angka kode urutan data\nPilih: ");
                    int pil = input.nextInt();
                    for(int k=0; k<Sedan.get(pil-1).size(); k++){
                    Pelanggan.get(p).add(3, Sedan.get(pil-1).get(k));    
                    }
                    JmlHrg.add(Sedan.get(pil-1).get(2));
                }else{
                    System.out.println("Pesanan Anda akan kami proses silahkan menuju ke kasir untuk proses pembayaran");
                    break;
                }
            }
        }
        else if (jenis==2){
            System.out.println("*******************************");
            System.out.println("\nCetak data mobil MiniBus");
            System.out.println("*******************************");
                
            for(int i=0; i < Minibus.size(); i++){
                int x = i+1;
                System.out.println("Data ke-"+ x);
                System.out.println("Type Mobil: "+Minibus.get(i).get(0));
                System.out.println("Warna     : "+Minibus.get(i).get(1));
                System.out.println("Harga     : "+Minibus.get(i).get(2));
                super.JmlHrg.add(Minibus.get(i).get(2));
                System.out.println("");
            }
            int i=0;
            while(i < 1){
                System.out.println("Pilih:\n 1. Tambah, 2. Stop");
                System.out.print("Masukan pilihan:");
                int ingin = input.nextInt();
                if(ingin==1){
                    System.out.print("Pilih sesuai angka kode urutan data\nPilih: ");
                    int pil = input.nextInt();
                    for(int k=0; k<Minibus.get(pil-1).size(); k++){
                    Pelanggan.get(p).add(3, Minibus.get(pil-1).get(k));    
                    }
                    JmlHrg.add(Minibus.get(pil-1).get(2));
                }else{
                    System.out.println("Pesanan Anda akan kami proses silahkan menuju ke kasir untuk proses pembayaran");
                    break;
                }
            }
        }
        else if (jenis==3){
            System.out.println("\nCetak data mobil Bus");
            System.out.println("_____________________________");
                
            for(int i=0; i < Bus.size(); i++){
                int x = i+1;
                System.out.println("Data ke-"+ x);
                System.out.println("Type Mobil: "+Bus.get(i).get(0));
                System.out.println("Warna     : "+Bus.get(i).get(1));
                System.out.println("Harga     : "+Bus.get(i).get(2));
                super.JmlHrg.add(Bus.get(i).get(2));
                System.out.println("");
            }
            int i=0;
            while(i < 1){
                System.out.println("Pilih:\n 1. Tambah, 2. Stop");
                System.out.print("Masukan pilihan:");
                int ingin = input.nextInt();
                if(ingin==1){
                    System.out.print("Pilih sesuai angka kode urutan data\nPilih: ");
                    int pil = input.nextInt();
                    for(int k=0; k<Bus.get(pil-1).size(); k++){
                    Pelanggan.get(p).add(3, Bus.get(pil-1).get(k));    
                    }
                    JmlHrg.add(Bus.get(pil-1).get(2));
                }else{
                    System.out.println("Pesanan Anda akan kami proses silahkan menuju ke kasir untuk proses pembayaran");
                    break;
                }
            }
        }
    }
}
