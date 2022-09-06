

package projeler;

        import java.time.LocalDate;

public class Isci {
    public String isim;
    public String soyisim;
    public int calismayaBasYili;
    public double maas;
    public int calismaSaati;
    public int standarCalisma=40;


    Isci(String isim,String soyisim, int calismayaBasYili, double maas, int calismaSaati) {
        this.isim=isim;
        this.soyisim=soyisim;
        this.calismayaBasYili=calismayaBasYili;
        this.maas=maas;
        this.calismaSaati=calismaSaati;
    }

    Isci() {
    }

    public double vergi() {

        if (maas > 1000) {

            return  maas*0.03;
        }

        return 0.0;
    }

    public double bonus() {
        int extraCalSaati=calismaSaati-standarCalisma;
        if (extraCalSaati > 0) {
            return extraCalSaati*30;
        }
        return 0;
    }

    public double maasArtis() {

        LocalDate buYil= LocalDate.now();

        if (buYil.getYear() - calismayaBasYili < 10) {
            return maas*0.05;
        } else if (buYil.getYear() - calismayaBasYili >= 10 || buYil.getYear() - calismayaBasYili < 20) {
            return maas*0.10;
        }else {
            return maas*0.15;
        }

    }


    public void toString(Isci isci) {

        System.out.println("Isci Bilgileri:\nisim :"+isci.isim+"\nSoyisim :"
                +isci.soyisim+"\nCalismaya Basladigi Yil : "
                + isci.calismayaBasYili+"\nMevcut Maasi : "+isci.maas
                +"\nHaftalik calisma saati"+isci.calismaSaati
                +"\nVergi : "+isci.vergi()
                +"\nBonus : "+isci.bonus()
                +"\nMaas artisi : "+isci.maasArtis()
                +"\nVergi ve bonus ile birlikte Toplam maas: "
                +(isci.maas-(isci.vergi())+(isci.bonus()))
                +"\nMaas artsindan sonra toplam maas : "+(isci.maas+isci.maasArtis()));
    }

    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                        "\nsoyisim='" + soyisim + '\'' +
                        "\ncalismayaBasYili=" + calismayaBasYili +
                        "\nmaas=" + maas +
                        "\ncalismaSaati=" + calismaSaati;
    }
}