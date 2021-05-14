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

class Set_idkonsumen extends DealerMobil {
    public String set_umur(){
        Scanner inputkonsumen=new Scanner(System.in);
        System.out.print("Input umur: ");
        umur = inputkonsumen.nextLine();
        return umur;
    }

    public String set_id(){
        Scanner inputkonsumen=new Scanner(System.in);
        System.out.print("Input Nomor Idensitas (KTP): ");
        noID = inputkonsumen.nextLine();
        return noID;
    }

    public String set_namakostumer(){
        Scanner inputkonsumen=new Scanner(System.in);
        System.out.print("Input Nama: ");
        nama = inputkonsumen.nextLine();
        return nama;
    }
}
