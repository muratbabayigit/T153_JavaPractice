package day02;

import java.util.Scanner;

public class P06_switchCase {

    // Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
    // 1. 0()dahil ile 50 arasi - D
    // 2. 50(dahil) ile 60 arası - C
    // 3. 60(dahil) ile 80 arası - B
    // 4. 80(dahil) ustu- A
    // Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
    // switch() kullanarak yapiniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Yıl Sonu Notunuzu Giriniz: ");
        int yilSonuNotu = scan.nextInt();
        if (yilSonuNotu < 0 || yilSonuNotu > 100) {
            System.out.println("Gerçersiz bir not girdiniz");
        } else {
            yilSonuNotu /= 10;
            switch (yilSonuNotu) {
                case 10:
                case 9:
                case 8:
                    System.out.println("Notunuzun Harf Karşılığı: A");
                    break;
                case 7:
                case 6:
                    System.out.println("Notunuzun Harf Karşılığı: B");
                    break;
                case 5:
                    System.out.println("Notunuzun Harf Karşılığı: C");
                    break;
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    System.out.println("Notunuzun Harf Karşılığı: D");
                    break;
                default:
                    System.out.println("Geçerli bir not girmediniz");
            }

        }

    }
}