/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.menghitung;

/**
 *
 * @author asus
 */
public class hitungmatematika {
    public static void main(String[] args){
        matematika operator = new matematika();
            operator.angka = 20;
            operator.tambah(20);
            operator.angka = 10;
            operator.kurang(5);
            operator.angka = 10;
            operator.kali(20);
            operator.angka = 20;
            operator.bagi(2);
    }
}

class matematika {
    int hasil = 0;
    int angka = 0;
    
    void tambah(int newAngka){
        hasil = angka + newAngka;
        System.out.println("\nPenjumlahan : " + angka + " + " + newAngka + " = " + hasil);
    }
    void kurang(int newAngka){
        hasil = angka - newAngka;
        System.out.println("\nPengurangan : " + angka + " - " + newAngka + " = " + hasil);
    }
    void kali(int newAngka){
        hasil = angka * newAngka;
        System.out.println("\nPerkalian : " + angka + " * " + newAngka + " = " + hasil);
    }
    void bagi(int newAngka){
        hasil = angka / newAngka;
        System.out.println("\nPembagian : " + angka + " / " + newAngka + " = " + hasil);
    }
}