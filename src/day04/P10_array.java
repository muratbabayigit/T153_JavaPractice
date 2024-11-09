package day04;

import java.util.Arrays;
import java.util.Scanner;

public class P10_array {
    public static void main(String[] args) {

        // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
        //kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk
        //elemaninin arasinki farki gosteren java programi yazin


        Scanner scan=new Scanner(System.in);
        System.out.print("Oluşturulacak array'in elaman sayısını giriniz: ");
        int arrayUzunluk= scan.nextInt();
        int arr[]=new int[arrayUzunluk];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Array'in "+(i+1)+". elemanını giriniz: ");
            int eleman= scan.nextInt();
            arr[i]=eleman;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Girilen elemanlardan en büyük ile en küçük arasındaki fark: "+(arr[arr.length-1]-arr[0]));
        scan.close();


    }



}
