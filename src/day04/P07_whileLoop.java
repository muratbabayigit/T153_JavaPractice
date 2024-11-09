package day04;

import java.util.Scanner;

public class P07_whileLoop {
    public static void main(String[] args) {
      // Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
      //         tamkare ise true  değilse false yazdırınız.

      //         Not: sqrt gibi fonksiyonları  kullanmayın.

      // Example 1:
      // Input: 16
      // Output: true
      // Not: bu sayı tamkare çünkü 4*4 = 16
        Scanner scan=new Scanner(System.in);
        System.out.print("Tam Kare olup olmadığını kontrol etmek istediğiniz pozitif bir sayı giriniz: ");
        int sayi=scan.nextInt();

        boolean tamKareMi=false;
        int i=1;

        while(i*i<=sayi){
            if (i*i==sayi){
                tamKareMi=true;
                break;
            }
            i++;
        }
        if (tamKareMi){
            System.out.println("Girdiğiniz "+sayi+", "+i+" sayısının tam karesine eşittir!");
        }else{
            System.out.println("Girdiğiniz "+sayi+" sayısı tamkare bir sayı değildir!");
        }


    }
}
