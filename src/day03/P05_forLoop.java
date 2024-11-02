package day03;

public class P05_forLoop {
    public static void main(String[] args) {
   /*
        1-180 arasındaki 8 ile bölünebilen sayıların toplamını yazın
    */
        int toplam=0;
        for (int i = 1; i <=180 ; i++) {
            if (i%8==0){
                toplam+=i;
            }
        }
        System.out.println("1-180 arasındaki 8 ile bölünebilen sayıların toplamı= "+toplam);
    }
}
