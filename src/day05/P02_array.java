package day05;

public class P02_array {
    public static void main(String[] args) {
        /*
         * 2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin
         * Input : {{1,2,3},{4,5},{6,7,8}}
         * Output : 8
         */

      maxValueBul();


    }

    public static void maxValueBul() {
        int arr[][]={{12,3,45}, {4},{26,1,23,25,148},{125}};
        int enBuyuk=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>enBuyuk){
                    enBuyuk=arr[i][j];
                }
            }
            
        }
        System.out.println("Bu nestedArray'deki en büyük değere sahip eleman: "+enBuyuk);



    }
}
