package Odevler;

public class SubString {
    public static void main(String[] args) {
        String input="mihrican" ;

        String tersInput=input.substring(7)+ //A
                input.substring(6,7)+ // Y
                input.substring(5,6)+ //A
                input.substring(4,5)+ //K
                input.substring(3,4)+ //K
                input.substring(2,3)+ //K
                input.substring(1,2)+ //K
                input.substring(0,1); //K


        System.out.println(tersInput);

    }
}
