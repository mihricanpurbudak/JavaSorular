package projeler;



        import java.util.Scanner;

public class KahvemakinasiSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("************************");
        System.out.println("-----Kahve Makinesi-----");
        System.out.println("************************");
        String islemler = "1.Türk Kahvesi\n" + "2.Filtre Kahve\n" + "3.Espresso\n" +
                "4.Americano\n" + "5.Cappicino\n" + "6.Cıkıs";
        System.out.println(islemler);
        System.out.println("************************");


        while (true){
            System.out.print("Yapmak istediginiz islemin numarasini giriniz : ");
            String hangiKahve = scanner.nextLine();
            switch (hangiKahve){
                case "1":
                    System.out.println("Türk kahvesi hazırlanıyor...");
                    break;
                case "2":
                    System.out.println("Filtre kahve hazırlanıyor...");
                    break;
                case "3":
                    System.out.println("Espresso hazırlanıyor...");
                    break;
                case "4":
                    System.out.println("Americano hazırlanıyor...");
                    break;
                case "5":
                    System.out.println("Cappicino hazırlanıyor...");
                    break;
                case "6":
                    System.out.println("Kahve Makinesi Sisteminden cikiliyor...");
                    break;
                default:
                    System.out.println("Hatalı tuşlama yaptınız.Tekrar deneyiniz...");
            }
            System.out.print("\nSüt eklememizi ister misiniz?\n" + "1.Evet\n" + "2.Hayır\n" + "Tuslayiniz: ");
            String sut = scanner.nextLine();
            switch (sut){
                case "1":
                    System.out.println("Süt ekleniyor...");
                    break;
                case "2":
                    System.out.println("Sut eklenmiyor...");
                    break;
                default: System.out.println("Hatali islem yaptiniz...");
            }

            System.out.print("\nSeker ister misiniz?\n" + "1.Evet\n" + "2.Hayır\n" + "Tuslayiniz: ");
            String seker = scanner.nextLine();
            if (seker.equals("1")) {
                System.out.print("Kaç seker olsun: ");
                int kacSeker = scanner.nextInt();
                scanner.nextLine();
                System.out.println(kacSeker + " seker ekleniyor");
            } else if (seker.equals("2")) {
                System.out.println("Şeker eklenmiyor ");
            } else {
                System.out.println("Hatalı giris yaptınız. Tekrar deneyiniz...");
                break;
            }
            System.out.print("\nHangi boyutta olsun?\n" + "1.Buyuk Boy\n" + "2.Orta Boy\n" + "3.Kucuk Boy\n" + "Tuslayiniz: ");
            String boyut = scanner.nextLine();
            switch (boyut){
                case "1":
                    System.out.println("Buyuk Boy Kahveniz hazirlaniyor...");
                    break;
                case "2":
                    System.out.println("Orta Boy Kahveniz hazirlaniyor...");
                    break;
                case "3":
                    System.out.println("Kucuk Boy Kahveniz hazirlaniyor...");
                    break;
                default:
                    System.out.println("Hatali gırıs yaptınız. Tekrar deneyiniz...");
            }
            System.out.println("\nKahveniz hazir. Afiyet olsun !!!");
            break;
        }
    }
}


