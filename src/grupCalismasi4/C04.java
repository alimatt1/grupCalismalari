package grupCalismasi4;

import java.util.ArrayList;

public class C04 {
    public static void main(String[] args) {
        //Döngüleri kullanarak tamsayılardan oluşan bir listenin
        // tüm öğelerinin benzersiz (tekrarsız) olup olmadığını kontrol ediniz.


        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);
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
        System.out.println(count);

        if (count== list.size()){
            System.out.println("listemizde tekrar eden sayi bulunmamaktadir");
        }else {
            System.out.println("listemizde tekrar eden sayi bulunmaktadir");
        }

    }
}
