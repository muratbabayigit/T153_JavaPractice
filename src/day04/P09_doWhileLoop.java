package day04;

import java.util.Scanner;

public class P09_doWhileLoop {
    // Problem Tanımı
    // Verilen bir sayının faktöriyelini özyineli (recursive) olarak
    // hesaplayan fonksiyonu yazınız.
    public static void main(String[] args) {
        System.out.println(faktoriyelBul());
    }

    public static long faktoriyelBul() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        int sayi= scan.nextInt();
        long faktoriyel=1;
        do {
        faktoriyel*=sayi;
                sayi--;
        }while(sayi>0);

        return faktoriyel;
    }


}
