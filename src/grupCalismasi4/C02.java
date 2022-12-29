package grupCalismasi4;

import java.util.ArrayList;

public class C02 {
    public static void main(String[] args) {
        //Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
        //Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10

        ArrayList <Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(3);
        sayilar.add(12);
        sayilar.add(13);
        sayilar.add(7);
        sayilar.add(4);

        for (Integer each:sayilar
             ) {
            if (each==7 || each==10){
                continue;
        }
            sayilar.set(sayilar.indexOf(each),each+2);
        }
        System.out.println(sayilar);//[14, 10, 12, 15, 9, 6]


    }
}
