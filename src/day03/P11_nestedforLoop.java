package day03;

import java.util.Scanner;

public class P11_nestedforLoop {
    public static void main(String[] args) {
        /*

         *
        ***
       *****
        ***
         *
        şeklini yazdırınız.


        */

        Scanner scan=new Scanner(System.in);
        System.out.print("Desen Yüksekliği: ");
        int yukseklik= scan.nextInt();

        
        int orta=yukseklik/2+1; // artışın son bulacağı azalmanın başlayacağı orta noktayı bulduk
        
        //Üst Yarımı yapalım

        for (int i = 1; i <=orta ; i++) {
            for (int j = i; j <orta ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i-1) ; k++) { //2*i-1 yazmamızın nedeni her bir satırda kaç yıldız olacağını belirlemel
                System.out.print("*");
            }
            System.out.println();
            
        }

        //alt yarımı yapalım

        for (int i = orta-1; i >=1 ; i--) {
            for (int j = orta; j >i ; j--) {
                System.out.print(" ");                
            }
            for (int k = 1; k <=(2*i-1) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        


    }
}
