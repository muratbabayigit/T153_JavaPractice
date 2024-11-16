package day05;

import java.util.Arrays;

public class P04_array {
    public static void main(String[] args) {
        /*
        Verilen bir int dizisi icin elemanlarin karelerini bulup yazdırın
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}

         */
        int [] arr={2,6,4,5,8,9,10,64};

        int [] squares=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            squares[i]=arr[i]*arr[i];
        }
        System.out.println("Elemanlar = "+Arrays.toString(arr));
        System.out.println("Elemanların Kareleri = " + Arrays.toString(squares));



    }
}
