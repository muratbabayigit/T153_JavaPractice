package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P09_List {
    public static void main(String[] args) {
        /*
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        int [] arr={1,2,2,3,1,4,2,5,6,8,7,5,9,1};

        List<Integer> list=new ArrayList<>();

        for (Integer eleman:arr) {
            if (!list.contains(eleman)){
                list.add(eleman);
            }
        }
        int []tekrarsizArray=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            tekrarsizArray[i]= list.get(i);
        }

        System.out.println(Arrays.toString(tekrarsizArray));





    }
}
