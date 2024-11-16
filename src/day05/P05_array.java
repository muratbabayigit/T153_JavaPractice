package day05;

import java.util.Arrays;

public class P05_array {
    public static void main(String[] args) {
       // String bir parametre kabul eden ve rakamların toplamını yazdıran bir method yazın
        String param="a2cd4m5bh678ali56";
        String []arr=param.split("");
        System.out.println(Arrays.toString(arr));
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
          if (Character.isDigit(arr[i].charAt(0))){  //isDigit methodu ile elemanın sayısal bir değere sahip olup olmadığını kontrol ettik
              toplam+=Integer.valueOf(arr[i]); //o string elemanın sayısal karşılığını toplama ekledik
          }else{
              continue;
          }
        }

        System.out.println("toplam = " + toplam);
    }
}
