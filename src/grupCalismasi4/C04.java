package grupCalismasi4;

import java.util.ArrayList;

public class C04 {
    public static void main(String[] args) {
        //Döngüleri kullanarak tamsayılardan oluşan bir listenin
        // tüm öğelerinin benzersiz (tekrarsız) olup olmadığını kontrol ediniz.


        ArrayList<Integer> list=new ArrayList<>();

        list.add(11);
        list.add(12);
        list.add(13);
        list.add(13);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(17);
        list.add(18);
        list.add(19);

        int count= list.size();

        /*for (int i = 0; i < list.size() ; i++) {
            for (int j = i; j < list.size() ; j++) {
                if (list(i)==list(j)){
                    count++;
                }
            }
       }
        */

        for (Integer each :list) {

            for (Integer w:list
                 ) {
                if (w==each){
                    count++;

                }
            }
        }

        if (count== list.size()){
            System.out.println("listemizde tekrar eden sayi bulunmamaktadir");
        }else {
            System.out.println("listemizde tekrar eden sayi bulunmaktadir");
        }

    }
}
