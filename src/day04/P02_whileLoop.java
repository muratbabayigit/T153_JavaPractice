package day04;

import java.util.Scanner;

public class P02_whileLoop {
    public static void main(String[] args) {
        // Kullanıcıdan bir kelime girmesini isteyip kelimenin içindeki
        // indexi çift sayi olan karakterleri yazdiran bir code create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String kelime= scan.next();
        int index=0;
        while(index<=kelime.length()-1){

            if(index%2==0){
                System.out.println(index+".index: "+kelime.charAt(index));
            }

            index++;
        }


    }

}
