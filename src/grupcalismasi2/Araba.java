package grupcalismasi2;

import java.util.Arrays;

public class Araba {
    //Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
    //Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
    //Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.

    String marka="tesla";
    int model =2022;
    String renk="kirmizi";

    static String renk2="sari";


    Araba(){
        marka="bmw";
        model=2010;

    }

    @Override
    public String toString() {
        return "Araba{" +
                "marka='" + marka + '\'' +
                ", model=" + model +
                ", renk='" + renk + '\'' +
                '}';
    }

    public Araba (String marka, int model, String renk){
        this.marka=marka;
        this.model=model;
        this.renk=renk;

    }

    public static void main(String[] args) {
        Araba a1=new Araba();

        System.out.println(a1);

        Araba a2=new Araba("toyota",2007,"kahverengi");

        System.out.println(a2);

        System.out.println(a1);

        System.out.println(Araba.renk2);




    }



}
