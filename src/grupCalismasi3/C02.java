package grupCalismasi3;

import java.util.ArrayList;
import java.util.List;

public class C02 {
    public static void main(String[] args) {
        //Listede 15 veya 13 varsa, bu elemanları kaldırınız.
        // Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(11);
        sayilar.add(13);
        sayilar.add(13);
        sayilar.add(15);
        sayilar.add(15);
        sayilar.add(17);
        sayilar.add(19);

        System.out.println(sayilar);//[11, 17, 19]


        if (!sayilar.contains(15) && !sayilar.contains(13)){
            System.out.println("listede 13 ve 15 sayilari mevcut degil");

        }else{
            for (int i = 0; i < sayilar.size() ; i++) {

                if (sayilar.get(i)==15){
                    int yeniIndex= sayilar.indexOf(15);
                    sayilar.remove(yeniIndex);
                    i--;


                }if (sayilar.get(i)==13){
                    int yeniIndex=sayilar.indexOf(13);
                    sayilar.remove(yeniIndex);
                    i--;

                }

            }
            System.out.println(sayilar);
        }



    }
}
