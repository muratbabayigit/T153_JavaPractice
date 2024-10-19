package day01;

public class P02_dataTypes {

    public static void main(String[] args) {
        //primitive
        //    byte-short-integer-long-float-double char boolean
        //Non-Primtive
        // Object - String


        String isim="Wise";
        String mesaj="";//Hiçlik yazdırır
        String number;

        System.out.println("isim = " + isim);
        System.out.println(mesaj);
        number="numara";
        System.out.println("number = " + number);


        byte a= 13;
        System.out.println("byte MAX Değer: "+ Byte.MAX_VALUE);
        System.out.println("byte MIN Değer: "+ Byte.MIN_VALUE);

        short b=1453;
        System.out.println("Short MAX Değer: "+ Short.MAX_VALUE);
        System.out.println("Short MIN Değer: "+ Short.MIN_VALUE);

        int c=2345678;
        int d;
        System.out.println("int MAX Değer: "+ Integer.MAX_VALUE);
        System.out.println("int MIN Değer: "+ Integer.MIN_VALUE);

        d=9716;
        System.out.println(d);

        boolean emekliMi;
        emekliMi=true; //true or false
        System.out.println("Murat Babayiğit\nEmekli mi:"+emekliMi);

        System.out.println();

        char murat='a';
        char murat2=97; //ASCII tablosunda 97'nin karşılığı a harfidir. Onu yazdırır
        // A:65   (+32) a:97     B=66  b=98  D=68  d=100

        System.out.println("murat = " + murat);
        System.out.println("murat2 = " + murat2);







    }
}
