package day02;

import java.util.Scanner;

public class P04_artikYilSorusu {
/*
      Kural 1: 4 ila bölünemeyen yıllar artık yıl değildir
      Kural 2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır
      Kural 3: 4 ve 100 ile bölünebilen ama sadece 400'ün katı olan yıllar  artık yıldır
 */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kontrol Edeceğiniz Yılı Yazınız: ");
        int year= scan.nextInt();

    //   System.out.println("---- If Else Statements Çözümü ----");
    //   if (year%100==0 && year%400==0){
    //       System.out.println("Girdiğiniz "+year+" yılı bir Artık Yıldır");
    //   } else if (year%100!=0 && year%4==0) {
    //       System.out.println("Girdiğiniz "+year+" yılı bir Artık Yıldır");
    //   }else{
    //       System.out.println("Girdiğiniz "+year+" yılı bir Artık Yıl Değildir");
    //   }

        System.out.println("---- Ternary Çözümü ----");

        String result=year%100==0? (year%400==0?"Girdiğiniz "+year+" yılı Artık Yıldır":"Girdiğiniz "+year+" yılı Artık Yıl Değildir")
                     :year%4==0?"Girdiğiniz "+year+" yılı Artık Yıldır":"Girdiğiniz "+year+" yılı Artık Yıl Değildir";
        System.out.println(result);






    }
}
