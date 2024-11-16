import java.util.Scanner;

public class T153_MARKET {

            /*
     Bir market yazılımı yazdığınızı düşünerek aşşağıdaki menü ile giriş yapıp, ilgili bölüme yönlendiren
     alışveriş yaptıran ve sepet tutarını hesaplayarak hafızada tutan, kasaya gidince fiş yazdıran bir program
     hazırlayın
      ==================== WISE MARKET KASA PROGRAMI ===================================
    ilk programa girildiginde bizi bir menu karsilasin bu secenekler
      1 ŞARKÜTERİ ÜRÜNLERİ
      2 MANAV ÜRÜNLERİ
      3 MARKET ÜRÜNLERİ
      secime gore ,
      4-urunleri listele ve
      5-fiyatlari gelsin

    */

    static Scanner scan=new Scanner(System.in);
    static int secim;
    static boolean ekUrun=false;
    static int urunKodu;
    static int urunMiktari;
    static String urunAdi="";
    static int urunfiyati;
    static int toplam;
    static String sepet="";
    static int tutar;



     public static void main(String[] args) {
        girisEkrani();
     }

    public static void girisEkrani() {
        System.out.println("==================== WISE MARKET KASA PROGRAMI ===================================");
        System.out.println("*****************  LÜTFEN MENÜDEN SEÇİM YAPINIZ  *****************");
        System.out.println("1-Şarküteri Reyonu\n2-Manav Reyonu\n3-Market Reyonu\n4-Fiş Yazdır\n5-Çıkış");
        System.out.print("Seçiminiz: ");
        secim= scan.nextInt();
        if (secim<1 || secim>5){
            System.out.println("Yanlış Seçim Yaptınız. Tekrar Deneyiniz...\n\n");
            girisEkrani();
        }else{
        switch (secim){
            case 1:sarkuteri();break;
            case 2:manav();break;
            case 3:market();break;
            case 4:fisYazdir();break;
            case 5:cikis();break;
            default:
        }
        }

    }

    public static void sarkuteri() {
        System.out.println("===================== ŞARKÜTERİ REYONU ===================================");
        System.out.println("*****************  LÜTFEN MENÜDEN SEÇİM YAPINIZ  *****************");
        System.out.println("101-Peynir 1kg paket 250₺\n102-Yoğurt  5kg paket 160₺\n103-Sucuk 1kg paket 450₺\n104-Pastırma  100g paket 200₺\n105-Yumurta 1 paket 140₺");

        while(!ekUrun){
            urunKodu= scan.nextInt();
            if (urunKodu>=101 && urunKodu<=105){
                System.out.print("Kaç Paket Alacaksınız: ");
                urunMiktari= scan.nextInt();

                switch (urunKodu){
                    case 101: urunAdi="Peynir"; urunfiyati=250; break;
                    case 102: urunAdi="Yoğurt"; urunfiyati=160; break;
                    case 103: urunAdi="Sucuk"; urunfiyati=450; break;
                    case 104: urunAdi="Pastırma"; urunfiyati=200; break;
                    case 105: urunAdi="Yumurta"; urunfiyati=140; break;
                }
                System.out.println(urunMiktari+" paket "+(urunfiyati*urunMiktari)+"₺");
                tutar=urunfiyati*urunMiktari;
                toplam+=tutar;
                sepet+=urunAdi+"______"+urunMiktari+"------------"+tutar+"₺\n";

                System.out.println();
                System.out.println("Toplam Alışveriş Tutarı: "+toplam+" ₺");
                System.out.print("Bu reyondan başka bir ürün almak istiyor musunuz?\nİstiyorsanız Ürün Kodu Giriniz\nAna Menüye dönmek için 0 (Sıfır) tuşuna basınız");
                System.out.println("Seçiminiz: ");
                }else if (urunKodu==0){
                girisEkrani();
            }
            }
    }

    public static void manav() {
        System.out.println("==================== MANAV REYONU ===================================");
        System.out.println("*****************  LÜTFEN MENÜDEN SEÇİM YAPINIZ  *****************");
    }

    public static void market() {
        System.out.println("==================== MARKET REYONU ===================================");
        System.out.println("*****************  LÜTFEN MENÜDEN SEÇİM YAPINIZ  *****************");
    }

    public static void fisYazdir() {
        System.out.println("==================== WISE MARKET KASA PROGRAMI ===================================");
        System.out.println("***********************  FİŞ YAZDIRMA  ***********************");

    }

    public static void cikis() {
         scan.close();
         System.exit(0);
    }


}
