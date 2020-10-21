/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.pkg3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Program3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               String [] laptop = {"Asus", "Acer", "Macbook", "Lenovo",};
       
        System.out.println("Selamat Datang");
        System.out.println("Selamat Berbelanja");
        System.out.println("0. Asus = Rp 6.000000");
        System.out.println("1. Acer = Rp 7.000000");
        System.out.println("2. Macbook = 10.000000");
        System.out.println("3.Lenovo = Rp 9.000000");

        System.out.println("Silahkan masukkan pilihan");
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt ();
        System.out.println("Input Pilihan : "+laptop[pilihan]);
       
int jumlah,harga,total,diskon;
      Scanner scan = new Scanner(System.in);
      System.out.println("Masukan Jumlah : ");
      jumlah = scan.nextInt();
      System.out.println("Masukan Harga : ");
      harga = scan.nextInt();           
      total = jumlah*harga;
    
      if (total >= 10000000) {
            diskon = total * 15 / 100;
            total = total - diskon;         
            System.out.println("Diskon = 15%");
      }else if
            (total >= 12000000) {
            diskon = total * 10 / 100;
            total = total - diskon;
            System.out.println("Diskon = 10%");
      }else if
            (total >= 15000000) {
            diskon = total * 5 / 100;
            total = total - diskon;
            System.out.println("Diskon = 5%");
      }   
      if (jumlah >= 2){
          diskon = total - ((total*5)/100);
          System.out.println("Tambah Diskon 5%\nTotal Bayar = "+diskon);
      }
      else{
          System.out.println("Total Bayar = Rp."+total);
      }
    }
    }
    

