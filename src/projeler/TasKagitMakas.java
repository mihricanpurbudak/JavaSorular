package projeler;


import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String args []){
        /*
         Öncelikle kullanıcıdan seçim alabilmek için Scanner sınıfını aktarıyoruz.
          Ardından main fonksiyonumuzda kullanıcının ve
           bilgisayarın puanlarını tanımlıyoruz.
           While döngümüzün içerisinde kullanıcıdan aldığımız seçimi
           “secim” isimli değişkene atıyoruz.
            Bilgisayarın seçimini ise Math.random methodunu kullanarak alıyoruz.
            Math.random()*3 diyerek bilgisayara
         0 ile 3 arasında bir rastgele sayı ürettiriyoruz.
         Ve seçimimiz ile bilgisayarın seçimini karşılaştırıp sonuçlarını yazıyoruz.
         */

        Scanner s = new Scanner(System.in);
        int kul_puan =0;
        int bil_puan=0;
        System.out.println("Taş kağıt makas oyununa hoş geldiniz!");
        System.out.println("1-Taş 2-Kağıt 3-Makas");
        while(true) {
            System.out.println("Seçiminiz: ");
            int secim = s.nextInt();  // KULLANICININ SECIMI
            int bil_secim = (int) (Math.random() * 3);

            if (secim == 1) { // KULLANICI TAS SECMEK ISTERSE
                if (bil_secim == 1) { // bilgisayar 1 secerse
                    System.out.println("Bilgisayarın seçimi: TaşSonuç:  Berabere");
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                } else if (bil_secim == 2) { //eger bilgisayar  KAGIT secerse
                    System.out.println("Bilgisayarın seçimi: KağıtSonuç: Kaybettiniz");//kagit tasi sarar puan bil.yazilir
                    bil_puan++;
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                } else { //bilgisayar MAKAS secerse KULLANICI kazanir ---> tas makasi KIRAR
                    System.out.println("Bilgisayarın seçimi: MakasSonuç: Kazandınız");
                    kul_puan++; // kullaniciya puan eklenir
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                }
            } else if (secim == 2) { //  kullanici KAGIT secerse
                if (bil_secim == 1) { // bilgisayar  TAS secerse
                    System.out.println("Bilgisayarın seçimi: TaşSonuç: Kazandınız");// kagit tasi sarar
                    kul_puan++; // kullanici kazanir puani
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                } else if (bil_secim == 2) { // bilgisayar KAGIT secerse
                    System.out.println("Bilgisayarın seçimi: KağıtnSonuç: Berabere");
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                } else { //bilgisayar makas secerse
                    System.out.println("Bilgisayarın seçimi: MakasnSonuç: Kaybettiniz");//makas kagidi keser
                    bil_puan++;
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                }
            } else if (secim == 3) { // kullanici MAKAS secerse
                if (bil_secim == 1) { // bil . TAS secerse
                    System.out.println("Bilgisayarın seçimi: TaşSonuç: Kaybettiniz");//tas makasi kirar
                    bil_puan++; // bil. kazanir
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                } else if (bil_secim == 2) { //bilgisayar  KAGIT secerse
                    System.out.println("Bilgisayarın seçimi: KağıtSonuç: Kazandınız");
                    kul_puan++;
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                } else { //bilgisayar Makas secerse
                    System.out.println("Bilgisayarın seçimi: MakasSonuç: Berabere");
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                }
            } else {
                System.out.println("Hatalı giriş yaptınız tekrar deneyin");
                continue;
            }
            if (kul_puan == 3) {
                System.out.println("Oyunu " + kul_puan + "-" + bil_puan + " kazandınız");
                break;
            } else if (bil_puan == 3) {
                System.out.println("Oyunu " + bil_puan + "-" + kul_puan + " kaybettiniz");
                break;
            }

        }
    }
}