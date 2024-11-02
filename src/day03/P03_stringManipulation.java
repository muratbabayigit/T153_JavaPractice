package day03;

import java.util.Scanner;

public class P03_stringManipulation {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner  scan=new Scanner(System.in);
        System.out.print("Lütfen 4 harfli bir kelime giriniz: ");
        String kelime= scan.nextLine();
        String terstenKelime="";
         if (kelime.length()>=4){
             kelime=kelime.substring(0,4);
             terstenKelime+=kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);

             System.out.println("kelime = " + kelime);
             System.out.println("terstenKelime = " + terstenKelime);

         }
         if (kelime.length()<4){
             System.out.println("4 harfli bir kelime girmediniz.");
         }





    }
}
