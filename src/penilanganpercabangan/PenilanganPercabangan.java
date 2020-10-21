/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilanganpercabangan;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class PenilanganPercabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
     Scanner input = new Scanner (System.in);
     String[] yesno = {"Membawa", "Tidak"};
     
     int dendaMasker = 100000, dendaSTNK = 500000, dendaSIM = 200000;
     int pilihan, pilihan2, pilihan3;
     
     System.out.println("####### PROSES PENILANGAN #######");
     System.out.println("Anda membawa masker? ");
     for (int i = 0; i < yesno.length; i++) {
         System.out.println(i+". "+yesno[i]);
    }
     System.out.print("Pilihan : ");
     pilihan = input.nextInt();
     
     if (pilihan == 0) {
         System.out.println("Anda membawa STNK?");
         for (int i = 0; i < yesno.length; i++) {
             System.out.println(i+". "+yesno[i]);
         }
         System.out.print("Pilihan : ");
         pilihan2 = input.nextInt();
         
         if (pilihan2 == 0) {
             System.out.println("Anda membawa SIM?");
             for (int i = 0; i < yesno.length; i++) {
                 System.out.println(i+". "+yesno[i]);
             }
             System.out.print("Pilihan : ");
             pilihan3 = input.nextInt();
             
             if (pilihan3 == 0) {
                 System.out.println("Selamat! Anda Mematuhi Tata Tertib!");
                 System.out.println("Anda Tidak Tertilang!Selamat sampai tujuan!");
             } 
             else if (pilihan3 == 1) {
                 System.out.println("Surat Anda Kurang Lengkap!Kami Curiga!");
                 System.out.println("Anda mendapat denda sebesar : Rp "+dendaSIM+",00");
                 System.out.println("Kendaraan anda kami tahan!");
             } 
             else {
                 System.out.println("Ulangi !");
                 System.out.println("Kode yang anda masukkan salah!");
                 System.out.println("Harap ulang kembali programnya!");
             }
         } else if (pilihan2 == 1) {
             System.out.println("Anda membawa SIM?");
             for (int i = 0; i < yesno.length; i++) {
                 System.out.println(i+". "+yesno[i]);
             }
             System.out.print("Pilihan anda : ");
             pilihan3 = input.nextInt();
             
             if (pilihan3 == 0) {
                 System.out.println("Surat Anda Kurang Lengkap!Kami Curiga!");
                 System.out.println("Anda mendapat denda sebesar : Rp "+dendaSTNK+",00");
                 System.out.println("Kendaraan anda kami tahan!");
             } 
             else if (pilihan3 == 1) {
                 System.out.println("Surat Anda sangat tidak Lengkap!Kami Curiga!");
                 System.out.println("Anda mendapat denda sebesar : Rp "+(dendaSTNK+dendaSIM)+",00");
                 System.out.println("Kendaraan anda kami tahan!");
             } 
             else {
                 System.out.println("Ulangi !");
                 System.out.println("Kode yang anda masukkan salah!");
                 System.out.println("Harap ulang kembali Programnya!");
             }
        } else if (pilihan == 1) {
         System.out.println("Anda membawa STNK?");
         for (int i = 0; i < yesno.length; i++) {
             System.out.println(i+". "+yesno[i]);
         }
         System.out.print("Masukkan pilihan anda : ");
         pilihan2 = input.nextInt();
         
         if (pilihan2 == 0) {
             System.out.println("Anda membawa SIM?");
             for (int i = 0; i < yesno.length; i++) {
                 System.out.println(i+". "+yesno[i]);
             }
             System.out.print("Pilihan anda : ");
             pilihan3 = input.nextInt();
             
             if (pilihan3 == 0) {
                 System.out.println("Surat Anda Kurang Lengkap!Kami Curiga!");
                 System.out.println("Anda mendapat denda sebanyak : Rp "+dendaMasker+",00");
             } 
             else if (pilihan3 == 1) {
                 System.out.println("Surat Anda sangat tidak Lengkap!Kami Curiga!");
                 System.out.println("Anda mendapat denda sebesar : Rp "+(dendaMasker+dendaSIM)+",00");
                 System.out.println("Kendaraan anda kami tahan!");
             } 
             else {
                 System.out.println("Ulangi !");
                 System.out.println("Kode yang anda masukkan salah!");
                 System.out.println("Harap ulang kembali Programnya!");
             }
         } else if (pilihan2 == 1) {
             System.out.println("Anda membawa SIM?");
             for (int i = 0; i < yesno.length; i++) {
                 System.out.println(i+". "+yesno[i]);
             } 
             System.out.print("Pilihan anda : ");
             pilihan3 = input.nextInt();
             
             if (pilihan3 == 0) {
                 System.out.println("Surat Anda Kurang Lengkap!Kami Curiga!");
                 System.out.println("Anda mendapat denda sebanyak : Rp "+(dendaMasker+dendaSTNK)+",00");
                 System.out.println("Kendaraan anda kami tahan!");
             }
             else if (pilihan3 == 1) {
                 System.out.println("Surat Anda sangat tidak Lengkap!Kami Curiga!");
                 System.out.println("Anda mendapat denda sebesar : Rp "+(dendaMasker+dendaSTNK+dendaSIM)+",00");
                 System.out.println("Kendaraan anda kami tahan!");
             }
             else {
                 System.out.println("Ulangi !");
                 System.out.println("Kode yang anda masukkan salah!");
                 System.out.println("Harap ulang Program!");
             }
         } else {
             System.out.println("Ulangi !");
             System.out.println("Kode yang anda masukkan salah!");
             System.out.println("Harap ulang Program!");
         }
    } else {
         System.out.println("Ulangi !");
         System.out.println("Kode yang anda masukkan salah!");
         System.out.println("Harap ulang Program!");
    }
}
}
}