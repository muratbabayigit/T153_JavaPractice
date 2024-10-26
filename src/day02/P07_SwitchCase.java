package day02;

import java.util.Scanner;

public class P07_SwitchCase {
    // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kontrol edeceğiniz ay kaçıncı aydır?: ");
        int monthNumber= scan.nextInt();

        switch (monthNumber){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Kontrol ettiğiniz ay 31 gündür.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Kontrol ettiğiniz ay 30 gündür.");
                break;
            case 2:
                System.out.println("Şubat ayının kaç gün olduğu yıla göre değişir.\nNormalde 28 gün olup 4 yılda bir 29 gün olur.");
                break;
            default:
                System.out.println("Geçersiz bir ay numarası giriniz!");
        }

    }


}
