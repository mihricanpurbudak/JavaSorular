package projeler;
import java.util.Scanner;

    public class Bilet_Method4_aktuell {

        public static void main(String[] args) {

            bilet("Köln ve Frankfurt");


        }

        public static void bilet(String köln_ve_frankfurt) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Hangi sehre gitmek istersiniz? Köln veya Frankfurt'tan birini secebilirsiniz." + "\n" + "20 KM başına 5 euro bilet parası alınmaktadir");

            String sehir = scan.next().toUpperCase();

            int FrankfurtKm = 60;
            int KolnKm = 80;
            int kmBirimFiyat = 5;
            int islem = 20;
            double toplamTutar = 0;
            double bakiye = 0;
            int kisiSayisi;
            int FrankfurtFiyat = FrankfurtKm * kmBirimFiyat / islem;          // 60*5/20
            int KölnFiyat = KolnKm * kmBirimFiyat / islem;                   // 80* 5/20;


            if (sehir.equals("FRANKFURT")) {
                System.out.println("Rota --> " + sehir + ":" + " 60 km " + FrankfurtFiyat + " Euro");

                do {
                    System.out.println("Kac kisilik bilet almak istiyorsunuz? Maxsimum 2 kisilik bilet olabilir");
                    kisiSayisi = scan.nextInt();


                } while (!(kisiSayisi == 1 || kisiSayisi == 2));


                System.out.println(kisiSayisi + " kisilik bilet: " + (FrankfurtFiyat * kisiSayisi) + " Euro");
                toplamTutar = FrankfurtFiyat * kisiSayisi;
                System.out.println("Lütfen parayi yatiriniz");
                bakiye = scan.nextDouble();

                do {
                    if (bakiye < toplamTutar) {

                        System.out.println("Girilen bakiye yetersiz!");
                        System.out.println((toplamTutar - bakiye) + " TL daha yatirmaniz gerekmektedir!");
                        bakiye += scan.nextDouble();

                    }
                }
                while (bakiye < toplamTutar);
                System.out.println("Girdiginiz rota: " + sehir + "\n" + "Girdiginiz bakiye: " + bakiye + " Euro" + "\n" + "Para üstünüz: " + (bakiye - (FrankfurtFiyat) * kisiSayisi) + " Euro" + "\nTekrar bekleriz..");


            } else if (sehir.equals("KÖLN")) {
                System.out.println("Rota --> " + sehir + ":" + "80 km " + KölnFiyat + " Euro");

                do {
                    System.out.println("Kac kisilik bilet almak istiyorsunuz? Maxsimum 2 kisilik bilet olabilir");
                    kisiSayisi = scan.nextInt();

                } while (!(kisiSayisi == 1 || kisiSayisi == 2));


                System.out.println(kisiSayisi + " kisilik bilet: " + (KölnFiyat * kisiSayisi) + " Euro");
                toplamTutar = KölnFiyat * kisiSayisi;
                System.out.println("Lütfen parayi yatiriniz");
                bakiye = scan.nextDouble();

                do {
                    if (bakiye < toplamTutar) {

                        System.out.println("Girilen bakiye yetersiz!");
                        System.out.println((toplamTutar - bakiye) + " TL daha yatirmaniz gerekmektedir!");
                        bakiye += scan.nextDouble();

                    }
                }
                while (bakiye < toplamTutar);
                System.out.println("Girdiginiz rota: " + sehir + "\n" + "Girdiginiz bakiye: " + bakiye + " Euro" + "\n" + "Para üstünüz: " + (bakiye - (KölnFiyat) * kisiSayisi) + " Euro" + "\nTekrar bekleriz..");


            } else {
                System.out.println("Yanlis giris yaptiniz, lütfen tekrar deneyiniz \n");

                bilet("Köln ve Frankfurt");


            }


        }


    }

