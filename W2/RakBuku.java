/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koleksibuku;

/**
 *
 * @author asus
 */
public class RakBuku {
    public static void main(String[] args){
        Buku buku1 = new Buku("Pemrograman Berbasis Obyek dengan Java","Indrajani","Elexmedia Komputindo",2007);
        Buku buku2 = new Buku("Dasar Pemrograman Java","Abdul Kadir","Andi Offset",2004);
        buku1.cetakBuku();
    }
}
class Buku{
    String judul;
    String pengarang;
    String penerbit;
    int year;
    
    public Buku(String judul,String pengarang, String penerbit,int tahun){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.year = year;
    }
    public void cetakBuku(){
        System.out.println("Judul Buku : " + this.judul);
        System.out.println("Pengarang : " + this.pengarang);
        System.out.println("Penerbit : " + this.penerbit);
        System.out.println("Tahun : " + this.year);
    }
}