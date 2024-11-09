package day04;

import java.util.Scanner;

public class P04_whileLoop {
    public static void main(String[] args) {
  /*
        kullanıcdan alınan bir sayinin basamak degerlerinin toplamini while loop ile yazdıran bir method create ediniz.

   */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 10'dan büyük bir sayı giriniz: ");
        long sayi= scan.nextInt();;

        basmakDegeriTopla(sayi);
    }

    public static void basmakDegeriTopla(long sayi) {
        int toplam=0;
        long girilenSayi=sayi;

        while(sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }
        System.out.println("Girdiğiniz "+girilenSayi+" sayısının basamak değerleri toplamı="+toplam);
    }
}
