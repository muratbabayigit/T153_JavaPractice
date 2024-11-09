package day04;

import java.util.Arrays;
import java.util.Scanner;

public class P10_array {
    public static void main(String[] args) {

        // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
        // kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk
        // elemaninin arasindaki farki gosteren java programi yazin


        Scanner scan=new Scanner(System.in);  //kUllanıcuı değer girişi için gerekli
        System.out.print("Oluşturulacak array'in elaman sayısını giriniz: "); // array'in uzunluğunu alıyor
        int arrayUzunluk= scan.nextInt();
        int arr[]=new int[arrayUzunluk]; // array oluşturuluyor. Boş bir array oluşturuyoruz
        // int arr2[]={12,25,36,45,12};
        for (int i = 0; i < arr.length; i++) { //Buradan itibaren array elemanları tek tek ekleniyor
            System.out.print("Array'in "+(i+1)+". elemanını giriniz: "); //her bir döngüde (0+1) 1. elemanı - (1+1) 2. Elemanı
            int eleman= scan.nextInt();
            arr[i]=eleman;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr); // Büyükten küçüğe sıraladık. 0. indekste en küçük osn indekste ise en büyük eleman oldu
        System.out.println(Arrays.toString(arr));
        System.out.println("Girilen elemanlardan en büyük ile en küçük arasındaki fark: "+(arr[arr.length-1]-arr[0]));
        scan.close();


    }



}
