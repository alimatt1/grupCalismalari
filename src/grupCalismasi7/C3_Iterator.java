package grupCalismasi7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C3_Iterator {
    /*
       Soru 1) Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program
       yaziniz . (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
       Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
       output: [23,40]
        */
    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(20);
        sayilar.add(23);
        sayilar.add(45);
        sayilar.add(14);
        sayilar.add(40);

        ListIterator<Integer> litr = sayilar.listIterator();

        while (litr.hasNext()) {

            // Integer sayi = litr.next();

            //if (sayi>40 || sayi<20) {

            litr.set((Integer) litr.next() + 5);

            // litr.remove();
            //}
        }
        System.out.println(sayilar);//[7, 18, 25, 28, 50, 19, 45]

        System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");

        while (litr.hasPrevious()){
            Integer sayi=(Integer) litr.previous();

            litr.set(sayi);
        }
        System.out.println(sayilar);
    }
}


