package projeler;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu3 {

    /*

    [1,100] kapali araligindan rastgele uretilen bir tam sayinin kullanici tarafindan bulunmasi gerekmektedir.
    Kullanicinin tahmini ile rastgele uretilen sayinin farkinin mutlak degeri
    (0,5] arasinda ise sayiya cok yaklastiniz ortam cok sicak
    (5,15] arasinad ise sayiya yaklastiniz ortam sicak
    (15,25 ] arasinda ise ortam ilik
    (25,35] arasinda ise sayi nerde sen nerdesin ortam normal
    (35,45] arasinad ise sayidan uzaklasiyorsunuz ortam soguk
    45 ten buyuk ise ortam cok soguk .

     */

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        Random randomNum=new Random();

        int Randomsayi,TahminEdilensayi,Farksayi,sayac=0;

        Randomsayi=randomNum.nextInt(101);

        do{
            System.out.println("Tahmininizi giriniz");
            TahminEdilensayi=input.nextInt();
            sayac++;

            Farksayi = Math.abs((Randomsayi-TahminEdilensayi));

            if(Farksayi>0 && Farksayi<=5)
                System.out.println("Sayiya cok yaklastiniz ortam cok sicak");

            else if (Farksayi >  5 && Farksayi <=  15)
                System.out.println("Sayiya yaklastiniz ortam sicak. ");

            else if (Farksayi >  15 && Farksayi <=  25)
                System.out.println("Ortam ilik");

            else if (Farksayi> 25 && Farksayi <= 35)
                System.out.println("Sayi nerde sen nerdesin ortam normal");

            else if (Farksayi> 35 && Farksayi <= 45 )
                System.out.println("ORtam soguk sayidan uzaklasiyorsunuz");

            else if (Farksayi> 45)
                System.out.println("Ortam coook soguk");
                




        }while (Farksayi !=0);
        System.out.println("Buldugunuz sayi:" + Randomsayi + "  -  " + sayac +  " defa tahmin hakkinizi kullandiniz");

    }
}
