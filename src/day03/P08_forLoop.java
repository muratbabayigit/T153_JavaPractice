package day03;

import java.util.Scanner;

public class P08_forLoop {
    public static void main(String[] args) {
        //  Kullanıcıdan 5 adet sayı isteyiniz
        //  Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        //  bu soruyu continue kullanarak çözünüz.


        int toplam=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("5 adet sayı giriniz");

        for (int i = 1; i <=5 ; i++) {
            System.out.print(i+".sayı =");
            int sayi= scan.nextInt();
            if (sayi>=5 && sayi<=10){
                continue;
            }
            toplam+=sayi;
        }

        System.out.println("\nToplam= "+toplam);
    }
}
