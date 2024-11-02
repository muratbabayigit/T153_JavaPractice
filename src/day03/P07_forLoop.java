package day03;

import java.util.Scanner;

public class P07_forLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String kelime= scan.next();
        String terstenKelime="";

        for (int i =kelime.length()-1; i >=0; i--) {
            terstenKelime+=kelime.charAt(i);

        }
        System.out.println("terstenKelime = " + terstenKelime);
    }
}
