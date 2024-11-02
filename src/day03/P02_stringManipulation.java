package day03;

import java.util.Scanner;

public class P02_stringManipulation {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        Scanner scan=new Scanner(System.in);
        System.out.print("Adınızı, İkinci adınızı ve Soyadınızı Giriniz: ");
        String nameSurname=scan.nextLine();

        //T a r ı k  B e r k  B a b a y i ğ i t

    //    System.out.println(nameSurname.substring(0,1)+"."+
//
    //            nameSurname.substring(nameSurname.indexOf(" ")+1,nameSurname.indexOf(" ")+2)+"."+
//
    //            nameSurname.substring(nameSurname.lastIndexOf(" ")+1,nameSurname.lastIndexOf(" ")+2)+".");
//
//
        System.out.println(nameSurname.substring(0,nameSurname.indexOf(" ")).charAt(0)+"."+
                           nameSurname.substring(nameSurname.indexOf(" ")+1,nameSurname.lastIndexOf(" ")).charAt(0)+"."+
                           nameSurname.substring(nameSurname.lastIndexOf(" ")+1).charAt(0)+"." );
    }
}
