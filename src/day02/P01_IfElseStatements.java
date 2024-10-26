package day02;

import java.util.Scanner;

public class P01_IfElseStatements {
    /*
     * BASİT HESAP MAKİNESİ
     * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
     *  dort islemden biri ile isleme koyup sonucun yazdiriniz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nİşlem yapacağınız iki sayıyı ve ssonrasında da işlem türünü sırayla giriniz\n");
        System.out.print("1.Sayı: ");
        double sayi1 = scan.nextDouble();
        System.out.print("2.Sayı: ");
        double sayi2 = scan.nextDouble();
        System.out.print("Yapılacak İşlem\n Toplama için +\n Çıkarma için -\nÇarpma için *\nBölme işlemi için / tuşuna basınız. \nİşlem Türü: ");
        char islem = scan.next().charAt(0);

        //Bağımsız If

//        if (islem == '+') {
//            double sonuc = sayi1 + sayi2;
//            System.out.println("Sonuç= " + sonuc);
//        }
//        if (islem == '-') {
//            double sonuc = sayi1 - sayi2;
//            System.out.println("Sonuç= " + sonuc);
//        }
//        if (islem == '*') {
//            double sonuc = sayi1 * sayi2;
//            System.out.println("Sonuç= " + sonuc);
//        }
//        if (islem == '/') {
//            double sonuc = sayi1 / sayi2;
//            System.out.println("Sonuç= " + sonuc);
//        }
//     if (islem != '+' || islem != '-' || islem != '*' || islem != '/') {
//
//         System.out.println("Geçersiz bir işlem girdiniz" );
//     }


        if (islem == '+') {
            double sonuc = sayi1 + sayi2;
            System.out.println("Sonuç= " + sonuc);
        } else if (islem == '-') {
            double sonuc = sayi1 - sayi2;
            System.out.println("Sonuç= " + sonuc);
        } else if(islem == '*') {
            double sonuc = sayi1 * sayi2;
            System.out.println("Sonuç= " + sonuc);
        }else if(islem == '/') {
            double sonuc = sayi1 / sayi2;
            System.out.println("Sonuç= " + sonuc);
        }else{ //else tüm mümkün olan ihtimaller bitince yazılır.
            System.out.println("Geçersiz bir işlem girdiniz" );
        }
    }


}
