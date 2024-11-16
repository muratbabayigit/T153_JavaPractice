import java.util.Scanner;

public class T153_MARKET {

    static Scanner scan=new Scanner(System.in);
    static int secim;
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
        System.out.println("==================== ŞARKÜTERİ REYONU ===================================");
        System.out.println("*****************  LÜTFEN MENÜDEN SEÇİM YAPINIZ  *****************");
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
