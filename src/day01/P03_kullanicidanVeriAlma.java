package day01;

import java.util.Scanner;

public class P03_kullanicidanVeriAlma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Adınız: ");
        String isim= scan.next();//scan.nextLine : tüm satırı alır, next() ise sadece ilk boşluğa kadar alır.
        scan.nextLine();
        System.out.print("Soyadınız: ");
        String soyad= scan.nextLine();
        System.out.println("Adı: "+isim+"\nSoyadı: "+soyad);



    }
}
