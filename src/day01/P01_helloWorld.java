package day01;

public class P01_helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Merhaba Dünya");
        String isim="Murat";
        System.out.println("isim = " + isim);
        //Direkt Değer yazdırmak için kullanılır. Ototmaitk olarak en oluşturulan variable gelir
        //İsterseniz diğer variable'ları da seçme imkanı sunar.
        System.out.println();

      /*
                Soru: Consola

                Hello World   "Hello World"
                iki Hello World arasında bir TAB boşluk vardır
                yazdırın.

       */

        //System.out.println("Hello World     ");System.out.println("\"Hello World\"");
        //Herhangi bir java karakterini metin olarak algılatmak istersek başına \ konulması gerekir
        System.out.println("Hello World     \"Hello World\"");
        System.out.println("Hello World \t\"Hello World\""); //  String içindeki \t ifadesi bir TAB kadar boşluk bıraktırır.
        System.out.println();

        /*
                Soru2: Consala tek bir System.out.println() kullanarak aşağıdaki ifadeyi yazdırın
                Adı: Murat
                Soyadı: BABAYİĞİT
         */
        System.out.println("Adı: Murat\nSoyadı: BABAYİĞİT");
        //String içindeki \n ifadesi alt satırdan yazmaya devam etmeyi sağlar


/*
        \t : bir TAB boşlukbırakır
        \n : bir alt satırdan devam eder
        \" : " işareti kod değil metin olarak işlenir
        \' : ' işareti kod değil metin olarak işlenir
 */

        String name="Ali";
        String surname="Can";
        System.out.println(name+"   "+surname);
        System.out.println(name+""+surname);
        System.out.println(name+" \t"+surname);


        System.out.println();

        //Clean Code kitabı pdf

        // print -println farkı

        //System.out.println(); ---> yazdırdıktan sonra hemen sonraki kodun işlevini bir alt satırdan işletmeye başlar
        System.out.println("Murat");System.out.println("Yiğit");

        //System.out.print(); ---> yazdırdıktan sonra hemen sonraki kodun işlevini aynı satırdan işletmeye başlar
        System.out.print("Murat");
        System.out.println(" Yiğit");


        System.out.println();

        System.err.println("Merhaba Hatalar"); //Kırmızı yazdırır. Genelde hata mesajlarını en sona yazdırır (serr)




    }
}
