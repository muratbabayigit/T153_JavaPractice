    package day03;

import java.util.Scanner;

public class P01_stringManipulation {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Adınızı ve Soyadınızı Giriniz: ");
        String isimSoyisim=scan.nextLine();
        String isim=isimSoyisim.substring(0,isimSoyisim.lastIndexOf(" "));
        String soyisim=isimSoyisim.substring(isimSoyisim.lastIndexOf(" ")+1);
        System.out.println("Adı: "+isim+"\nSoyisim: "+soyisim);
        // Tarık Yiğit girilirse;
     /*
        Adı: Tarık
        Soyisim: Yiğit

      */

        //Tarık Berk BABAYİĞİT
    /*
        Adı: Tarık
        Soyisim: Berk BABAYİĞİT

      */



    }
}
