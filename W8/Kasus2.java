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
public class Kasus2 {
    public static void main(String args[]){
        SetKaryawan n1 = new SetKaryawan();
        System.out.println("Input Data karyawan\n");
        n1.set2D();
        // n1.set2D();
        Get_datakaryawan s1 = new Get_datakaryawan();
        s1.cetak();

        Set_mobiljual n2 = new Set_mobiljual();
        n2.inSedan(1);
        n2.inMinibus(1);
        n2.inBus(1);
        Get_datamobil s2 = new Get_datamobil();
        s2.get_data();

        // Edithrg n3 = new Edithrg();
        // n3.ubah();

        Input_customer n = new Input_customer();
        System.out.println("\nInput Data Pelanggan\n");
        n.data_pembelian();
        // n.set2D();
        Cetak_datapelanggan s = new Cetak_datapelanggan();
        s.cetak();

        Get_alldata s0 = new Get_alldata();
        s0.cetak();
        n1.untung();
	}
}
