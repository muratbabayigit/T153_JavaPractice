package day02;

import java.util.Scanner;

public class dd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen notunuzu yazınız...");
        int not = scan.nextInt();
        not /=10;
        switch (not){
            case 10:
            case 9:
            case 8:
                System.out.println("HARF NOTUNUZ A ");
                break;
            case 7:
            case 6:
                System.out.println("harf notunuz B");
                break;
            case 5:
                System.out.println("harf notunuz C");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("harf notunuz D");
            default:
                System.out.println("lütfen geçerli bir not giriniz.");
        }
    }
}
