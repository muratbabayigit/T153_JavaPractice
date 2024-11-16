package day05;

import java.util.Arrays;

public class P03_array {
    /*
     * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
     *
     * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
     */
    public static void main(String[] args) {
        String str = "$1-$23-$134-$2-$7-$24-£32-£40-£2-£65-£4-";

        String arr[]=str.split("-");
        System.out.println(Arrays.toString(arr));//[$1, $23, $134, $2, $7, $24, £32, £40, £2, £65, £4]
        int dolarTopl=0;
        int poundTopl=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")){
                dolarTopl+=Integer.parseInt(arr[i].replace("$",""));
            }else{
                poundTopl+=Integer.parseInt(arr[i].replace("£",""));
            }
        }
        System.out.println("$ Toplamı = " + dolarTopl);
        System.out.println("£ Toplamı = " + poundTopl);



    }
}
