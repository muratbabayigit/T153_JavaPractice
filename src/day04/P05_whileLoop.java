package day04;

import java.util.Scanner;

public class P05_whileLoop {
    public static void main(String[] args) {
        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 5 tane sayı giriniz!");
        int sayac=1;
        int enBuyuk=0;
        int sayi=0;
        while(sayac<=5){
            System.out.print(sayac+". sayıyı giriniz: ");
            sayi= scan.nextInt();
            if (sayi>enBuyuk){
                enBuyuk=sayi;
            }
            sayac++;

        }
        System.out.println("Girilen sayılardan en büyüğü: "+enBuyuk);


    }
}
