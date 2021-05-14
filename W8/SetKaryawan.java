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

class SetKaryawan extends DealerMobil {

    public String Umur(){
        Scanner input=new Scanner(System.in);
        System.out.print("Input umur: ");
        umur = input.nextLine();
        return umur;
    }

    public String Identitas(){
        Scanner input=new Scanner(System.in);
        System.out.print("Input Nomor Idensitas Kerja: ");
        noID = input.nextLine();
        return noID;
    }

    public String Nama(){
        Scanner input=new Scanner(System.in);
        System.out.print("Input Nama: ");
        nama = input.nextLine();
        return nama;
    }

    public void set2D(){   
        int z = Urus.size();
        z+=1;
        System.out.println("Input ke-"+ z);
        Nama();
        Umur();
        Identitas();
        // super.Beli(int n);

        int p = Urus.size();
        Urus.add(new ArrayList<String>());
        Urus.get(p).add(0, nama);
        Urus.get(p).add(1, umur);
        Urus.get(p).add(2, noID);
    }

    public void untung(){
        int z0 = 0;
        for(int i = 0; i<JmlHrg.size(); i++){
            String z2 = JmlHrg.get(i);
            int z1 = Integer.parseInt(z2);
            z0 = z0 + z1;
        }
        System.out.println("untung:"+(z0*0.1));
    }
}
