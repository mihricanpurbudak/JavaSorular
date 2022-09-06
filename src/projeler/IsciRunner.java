package projeler;

        import java.time.LocalDate;

public class IsciRunner {
    public static void main(String[] args) {
        Isci isci1 = new Isci("Mustafa", "Bek", 2018, 3000,45);



        System.out.println("1***************");
        isci1.toString(isci1);
        System.out.println("2*******************");

        Isci isci2 = new Isci("ALi","Yildiz",2005,4000,40);
        isci2.toString(isci2);
        System.out.println("******************");
        System.out.println("isci2 bilgileri ;\n"+isci2.toString());

        Isci isci3 = new Isci("ahmet", "Yildiz", 2010, 2500, 46);

        isci3.toString(isci3);
        System.out.println("****");
        System.out.println(isci1);


    }
}
