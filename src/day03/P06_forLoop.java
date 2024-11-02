package day03;

import javax.swing.*;

public class P06_forLoop {
    /*
     * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
     * döngüden çıkılsın
     *
     * Bugün hava oldukca güzel.-> 2
     *
     *
     */
    public static void main(String[] args) {
        String cumle= JOptionPane.showInputDialog("\nLütfen bir cümle yazınız: \n");
        System.out.println("Girdiğiniz Cümle = " + cumle);
        int sayac=0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.toLowerCase().charAt(i)=='a'){
                sayac++;
            }
            if (cumle.toLowerCase().charAt(i)=='c'){
                break;
            }


        }
        System.out.println("Girdiğiniz cümlede ilk c harfine kadar "+sayac+" adet a harfi vardır");
        System.out.println("------------------- contunie -------------------------");
        for (int i = 0; i <=5; i++) {
            if (i==3){
                continue;
            }
            System.out.print(i+" ");


        }
    }


}
