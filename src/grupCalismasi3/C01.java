package grupCalismasi3;

import java.util.ArrayList;
import java.util.List;

public class C01 {
    public static void main(String[] args) {
        //Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
        // Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(11);
        sayilar.add(13);
        sayilar.add(15);
        sayilar.add(17);
        sayilar.add(15);
        sayilar.add(19);

        System.out.println(sayilar);//[11, 13, 15, 17, 15, 19]

        for (int i = 0; i <sayilar.size() ; i++) {

            if (sayilar.get(i)==15){
                int yeniIndex= sayilar.indexOf(15);
                sayilar.set(yeniIndex,51);

            }


        }
        System.out.println(sayilar);

        }
    }


