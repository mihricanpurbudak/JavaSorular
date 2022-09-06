        package projeler;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;


public class YiyecekOtomati {
    /*
    projemizin adı YIYECEK OTOMATI
        --15 adet ürün ve bu ürünlerin fiyatlarını belirleyiniz.
    Bu ürünler ekranda listelensin
        --ürün seçip, para miktarı giriniz
        --girdiğiniz para fazla ise üstünü versin, eksik ise ekleme yapmanızı istesin
        --Ek ürün seçme seçeneği olsun, siz devam ettiğiniz sürece,para kontrolünü de yaparak işlem yapmaya devam etsin...
    NOT: Otomat sadece 1 tl , 5 tl, 10 tl, 20 tl miktarlarını kabul etsin
    iyi çalışmalar
    Kolay gelsin...
            1 ne istedigini sor
        2 fiyatini hesabla
        3 parasini al
         */
    static Scanner scan = new Scanner(System.in);
    static int urunNo;
    static double fiyat = 0.0;
    static double toplamTutar = 0.0;
    static double girilenPara = 0.0;
    static double bakiye = 0.0;
    static double paraUstu;
    static boolean tercih = true;
    static List<String> sepet = new ArrayList<>();


    public static void main(String[] args) {

        alisveriseBasla();
        urunSec();


    }

    private static void alisveriseBasla() {
        System.out.println("Lutfen urun almak icin 1 Tl ya da 5,10,20 TL'lik banknot girisi yapiniz");
        girilenPara = scan.nextInt();
        if (girilenPara == 1.0 || girilenPara == 5.0 || girilenPara == 10.0 || girilenPara == 20.0) {
            bakiye += girilenPara;
        } else {
            System.out.println("Lutfen gecerli para girisi yapiniz");
            alisveriseBasla();
        }
    }

    private static void odemeYap() {
        paraUstu = bakiye - toplamTutar;
        if (paraUstu > 0) {
            System.out.println("Islem Tamamlandi, urunleriniz hazirlaniyor\nLutfen "
                    + paraUstu + " TL para ustunu aliniz \nTesekkur ederiz");
        } else {
            System.out.println("Islem tamamlandi, urunleriniz hazirlaniyor \nTesekkur ederiz");
        }

        tercih = false;

    }

    private static void urunEkle() {
        while (tercih) {
            System.out.println("Lutfen istediginiz urunun numarasini giriniz");

            urunNo = scan.nextInt();

            fiyatHesapla();

        }
    }

    private static void fiyatHesapla() {  //tum listelerin uzunlugu ayni
        int urunlerNo[] = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115};

        String urunler[] = {"Cola", "Fanta", "Sprite", "IceTea", "Su", "Milka", "Snickers", "Magnum", "Sandvic", "Cips", "Pringels",
                "Kraker", "Sakiz", "Eticin", "Biskrem"};
        double fiyatList[] = {2.10, 2.00, 1.90, 1.90, 0.90, 1.50, 1.10, 3.10, 3.30, 1.70, 2.80, 0.70, 1.70, 1.40, 1.50};
        int sira = Arrays.binarySearch(urunlerNo, urunNo); //secilen urunun indeksini verir
        //System.out.println(sira);
        fiyat = fiyatList[sira];//buldugumuz index numarasi ile secilen urunun fiyatini buluyoruz

        toplamTutar += fiyat;
        sepet.add(urunler[sira]);//sectigimiz urunlrri gormek icin bir list e atiyoruz
        System.out.println("sectiginiz urunler :" + sepet + "\nToplam tutar : " + toplamTutar + "\nbakiyeniz : " + (bakiye - toplamTutar));

        while (bakiye < toplamTutar) { //bakiye yetersiz ise bakiye toplam tutardan fazla oluncaya kadar para attiriyoruz
            if (toplamTutar > bakiye) {
                System.out.println("Lutfen ek para girisi yapiniz");
                alisveriseBasla();
            }
        }

        sonrakiIslem();//secilen ilk urunun fiyati hesaplandiktan sonra odemeye ya da urun eklemeye yonlendiriyoruz

    }

    private static void sonrakiIslem() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yeni urun eklemek icin 1'e basin, \nAlisverisi tamamlamak icin 2'ye basiniz");
        int tercih = scan.nextInt();
        if (tercih == 1) {
            urunEkle();
        } else if (tercih == 2) {
            odemeYap();

        } else {
            System.out.println("Lutfen gecerli bir tercih yapiniz");
            sonrakiIslem();
        }

    }

    private static void urunSec() {
        System.out.println("\t\tNo\t\tUrun\t\t\tFiyat\n" +
                "\t\t==\t\t====\t\t\t=====\n" +
                "\t\t101\t\tCola     \t\t2.10 TL\n" +
                "\t\t102\t\tFanta    \t\t2.00TL\n" +
                "\t\t103\t\tSprite   \t\t1.90 TL\n" +
                "\t\t104\t\tIceTea   \t\t1.90 TL\n" +
                "\t\t105\t\tSu       \t\t0.90 TL\n" +
                "\t\t106\t\tMilka    \t\t1.50 TL\n" +
                "\t\t107\t\tSnickers \t\t1.10 TL\n" +
                "\t\t108\t\tMagnum   \t\t3.10 TL\n" +
                "\t\t109\t\tSandvic  \t\t3.30 TL\n" +
                "\t\t110\t\tCips     \t\t1.70 TL\n" +
                "\t\t111\t\tPringelst\t\t2.80 TL\n" +
                "\t\t112\t\tKraker   \t\t0.70 TL\n" +
                "\t\t113\t\tSakiz    \t\t1.70 TL\n" +
                "\t\t114\t\tEticin   \t\t1.40 TL\n" +
                "\t\t115\t\tBiskrem  \t\t1.50 TL\n");


        System.out.println("Lutfen istedigniz urunun numarasini giriniz");

        urunNo = scan.nextInt();
        if (urunNo >= 101 && urunNo <= 115) {
            fiyatHesapla();
        } else {
            System.out.println("Lutfen gecerli bir urun No giriniz");
            urunSec();
        }


    }

}