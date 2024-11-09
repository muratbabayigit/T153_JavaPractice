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


        }
        }
