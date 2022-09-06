package Odevler;

import java.util.Scanner;

public class SesliHarfBulma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        String harf=scan.nextLine().toLowerCase();
        String sesliHarf="aeiou";

        char karakter=harf.charAt(0);

        if ((harf.length()==1)&&(karakter>='a' &&(karakter<='z'))){

            if (sesliHarf.contains(harf)){
                System.out.println( "bu harf sesli harftir");

            }else{
                System.out.println(" bu harf sessiz harftir");
            }
        }else{
            System.out.println(" yanlis karakter girdiniz");
        }

    }
}
