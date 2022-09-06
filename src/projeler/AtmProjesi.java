package projeler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
         /*
    Bir tane Atm projesi yazin
    Islem yapabilmek icin kart numarasi ve sifre isteyin
    Para yatirma ,para cekme,para gonderme,sifre degistirme,bakiye sorgulama ve cikis fonksiyonlari olsun
    Her islemde bana kalan bakiyeyi gostersin
    Fatura isterse yazdirin istemezse " Tebrikler dogayi korudugunuz icin tesekkur ediyoruz !" yazdirin
​
    IBAN = TR12 3456 78123456 7812345 678
​
​
     */

        static double bakiye;
        static String kartNo = "12345678";
        static int sifrem = 1234;
        static int yeniSifre;



        static Scanner scan = new Scanner(System.in);

        public static void main (String[]args){

            System.out.println("JAVA BANK'A HOSGELDINIZ !\n****************************\n");


            do {

                System.out.print("Lutfen kart numaranizi giriniz --> ");
                kartNo = scan.nextLine();

                System.out.print("Lutfen sifrenizi giriniz --> ");
                sifrem = scan.nextInt();
                scan.nextLine();

                if (sifrem != 1234 || !kartNo.equals("12345678")) {
                    System.out.println("Hatali tuslama yaptiniz.\nLutfen tekrardeneyiniz");
                    System.out.println("**************************************************\n");
                }


            } while (sifrem != 1234 || !kartNo.equals("12345678"));


            atmPanel();

        }

        private static void atmPanel () {

            System.out.println("Bilgileriniz kontrol ediliyor...");
            System.out.println("***********************************");
            System.out.println("Sifreniz onaylandi!");
            char islem = ' ';

            do {
                System.out.println("Lutfen yapmak istediginiz islemi giriniz...\nA-Para yatirma\nB-Para cekme\nC-Para gonderme" +

                        "\nD-Sifre degistirme" + "\nE-Bakiye sorgula\nF-Fatura\nG-Cikis");

                islem = scan.next().toUpperCase().charAt(0);


                switch (islem) {
                    case 'A':
                        paraYatir();
                        break;
                    case 'B':
                        paraCek();
                        break;
                    case 'C':
                        paraGonder();
                        break;
                    case 'D':
                        sifreDegistir();
                        break;
                    case 'E':
                        bakiyeSorgula();
                        break;
                    case 'F':
                        System.out.println("Fatura ister misiniz...\nEvet icin 'E' - Dogayi korumak icin 'H'");
                        char islem2 = scan.next().toUpperCase().charAt(0);

                        if (islem2 == 'E') {
                            fatura();
                        } else {
                            System.out.println("Tebrikler dogayi korudugunuz icin tesekkur ediyoruz !");
                        }
                        break;
                    case 'G':
                        break;
                    default:
                        System.out.println("Lutfen gecerli bir islem seciniz..\n");

                        break;
                }

            } while (islem != 'G');


        }

        private static void fatura () {
            LocalDateTime ldt = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yy" + " HH:mm");

            System.out.println("+-------------------+\r\n"
                    + "|" + ldt.format(dtf) + "|\r\n"
                    + "|                   |\r\n"
                    + "|     JAVA BANK     |\r\n"
                    + "|                   |\r\n"
                    + "| Bakiyeniz --> " + bakiye + "|\r\n"
                    + "|                   |\r\n"
                    + "|                   |\r\n"
                    + "|                   |\r\n"
                    + "|                   |\r\n"
                    + "|                   |\r\n"
                    + "|    TESEKKURLER    |\r\n"
                    + "+-------------------+\r\n"
                    + "");




        }

        private static void bakiyeSorgula () {
            System.out.println("Bakiyeniz ==> $" + bakiye);
            System.out.println("***********************************\n");

        }

        private static void sifreDegistir () {


            System.out.println("Lutfen sifrenizi dogrulayiniz...");

            int sifreKontrol = scan.nextInt();
            int yeniSifre;

            if (sifrem == sifreKontrol) {
                System.out.println("Sifreniz dogrulandi\nLutfen yeni sifrenizi giriniz...");
                yeniSifre = scan.nextInt();
                sifrem = yeniSifre;



            } else {
                System.out.println("Sifreniz eslesmedi !");
                System.out.println("*****************************************");
            }



        }



        private static void paraGonder () {

            System.out.println("Lutfen gondereceginiz kisinin IBAN'ini giriniz...");
            scan.nextLine();
            String IBAN = scan.nextLine();

            // TR12 12 12 12 12 121 2 1212 1212 12
            if (IBAN.startsWith("TR") && IBAN.replaceAll("\\s", "").length() == 26) {

                System.out.println("IBAN Bilgileri kontrol ediliyor...\nIBAN dogrulandi");
                System.out.println("Lutfen gondereceginiz tutari giriniz : ");
                double havaleTutari = scan.nextDouble();


                if (bakiye >= havaleTutari) {
                    bakiye -= havaleTutari;

                    System.out.println("Islem tamamlandi !");
                    System.out.println("Kalan bakiyeniz : " + bakiye);
                    System.out.println("********************************\n\n");

                } else {
                    System.out.println("Yetersiz bakiye !");
                    System.out.println("********************************\n\n");
                }


            } else {
                System.out.println("********************************\n\n");
                System.out.println("Gecersiz IBAN !");
            }

        }

        private static void paraCek () {

            System.out.println("Lutfen cekmek istediginiz tutari giriniz...");
            double cekilenPara = scan.nextDouble();

            if (bakiye >= cekilenPara) {
                bakiye -= cekilenPara;
                System.out.println("Kalan bakiyeniz : " + bakiye);
                System.out.println("Islem tamamlandi !");
                System.out.println("********************************\n\n");

            } else {
                System.out.println("Yetersiz bakiye !");
                System.out.println("********************************\n\n");
            }

        }

        private static void paraYatir () {

            System.out.println("Lutfen yatirmak istediginiz tutari giriniz...");
            double yatirilanPara = scan.nextDouble();
            bakiye += yatirilanPara;

            System.out.println("Kalan bakiyeniz : " + bakiye);
            System.out.println("Islem tamamlandi !");
            System.out.println("********************************\n\n");


        }
    }

    private static void atmPanel() {
    }
}