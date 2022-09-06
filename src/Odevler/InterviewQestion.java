package Odevler;

import java.util.Scanner;

public class InterviewQestion {
    public static void main(String[] args) {

       /* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString
		  Ceviri:
		  Bir dizeyi tersine çevirmek için bir Java programı yazın.
		  for döngüsü kullanın ve adında bir yöntem oluşturun
		  tersDize*/
        Scanner scan = new Scanner(System.in);
        System.out.println("String giriniz");
        String str = scan.nextLine();
        String tersStr = "";
        System.out.println(tersStr(str, tersStr));
    }

    private static String tersStr(String str, String tersStr) {
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.charAt(i);

        }
        return tersStr;




    }
}