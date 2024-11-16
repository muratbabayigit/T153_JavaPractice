package day05;

import java.util.ArrayList;
import java.util.Collections;

public class P07_arrayList {

      //2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
     // listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
     //Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
     //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

    public static void main(String[] args) {
        String [][] arr={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
        listeEkle(arr);
    }

    public static void listeEkle(String[][] arr) {
        ArrayList<String> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                list.add(arr[i][j]);
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }

}
