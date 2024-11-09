package day04;

import java.util.Random;
import java.util.Scanner;

public class P03_sayiTahminOyunu {
    public static void main(String[] args) {
 /*
        Kullanıcıdan 1 ila 25 arasında tahmin yapıp belirlenen sayıyı bulup bulmadığını kontrol eden
        bulursa tebrikler bildiniz desin. tahmin hakkı 5 olmak üzere bilemediğinde
        üzgünüm bilmediniz ve 1 tahmin hakkınız kaldı desin

  */
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int hedefSayi = random.nextInt(1, 500);
        //System.out.println("hedefSayi = " + hedefSayi);
        System.out.println("1 ile 500 arasında aklımdan bir sayı tuttum. Hadi tahmin et");

        int tahmin = 0;
        int tahminSayisi = 1;
        int tahminHakki=5;
        while (tahminHakki>0) {
                System.out.print("Tahminini gir: ");
                tahmin = scan.nextInt();

                if (tahmin < hedefSayi) {
                    System.out.println("Doğru bilmediniz. Arttırarak yeniden deneyiniz");
                } else if (tahmin > hedefSayi) {
                    System.out.println("Doğru bilmediniz. Azaltarak yeniden deneyiniz");
                } else {
                    System.out.println(tahminSayisi + ". tahminizde doğru bildiniz. Tebrikler");
                }
                tahminSayisi++;
                tahminHakki--;
                if (tahminHakki>0){
                    System.out.println(tahminHakki+" adet tahmin hakkınız kaldı!");
                }else{
                    System.out.println("Üzgünüm bilmediniz. Tahmin etmeniz gereken sayı: "+hedefSayi);
                }
            }

       //int hedefSayi = random.nextInt(1,25);
       //System.out.println("1 ile 25 arasinda bir sayi tuttum, tahmin et. 5 hakkin var.");
       //System.out.println("Tahminini gir.");
       //int tahmin = scanner.nextInt();
       //int tahminSayisi=1;
       //if (tahminSayisi<5 && tahmin!=hedefSayi){
       //    while (tahminSayisi<5 && tahmin!=hedefSayi){
       //        System.out.println("Malesef bilemediniz, " + (5-tahminSayisi) + " Hakkiniz kaldi. ");
       //        if (tahmin<hedefSayi){
       //            System.out.println(" Tuttugum sayi daha yuksek.");
       //        } else if (tahmin>hedefSayi) {
       //            System.out.println(" Tuttugum sayi daha dusuk.");
       //        }
       //        tahmin = scanner.nextInt();
       //        tahminSayisi++;
       //    }
       //}
       //if (tahmin==hedefSayi){
       //    System.out.println("Tebrikler " + tahminSayisi + ". tahmininizde bildiniz. sayi " + hedefSayi+" idi.");
       //}else {
       //    System.out.println("Malesef bilemediniz, sayi "+ hedefSayi+" idi.");
       //}
        }
        }
