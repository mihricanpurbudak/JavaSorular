package Odevler;

import java.util.Scanner;

public class ArraydeSesliHarfBulma {
    public static void main(String[] args) {

         /*
        Soru 3- Kullanicidan aldiginiz bir harfin,
        verilen array'de olup olmadigini
        kontrol edip, bize true veya false sonucu
        donen bir method olusturun.
         */
        char[] sesliHarf = {'a', 'e', 'i', 'o', 'u'};
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char girilenHarf = scan.next().charAt(0);


        boolean sonuc =SesliHarfBulmaContains(sesliHarf,girilenHarf);
        if (sonuc) {
            System.out.println("Girilen harf sesli harftir");


        } else {
            System.out.println("Girilen harf sesli harf degildir");


        }

    }

    private static boolean SesliHarfBulmaContains(char[] sesliHarf, char girilenHarf) {
        boolean sonucMethod=false;
        for (int i = 0; i <sesliHarf.length ; i++) {
            if (sesliHarf[i]==(girilenHarf)){
                sonucMethod=true;

            }

        }
        return sonucMethod;
    }


}
