package grupCalismasi7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class C2_Iterator {
    public static void main(String[] args) {

        Collection<Integer> sayilar=new ArrayList<>();

        sayilar.add(11);
        sayilar.add(8);
        sayilar.add(10);
        sayilar.add(6);

        Iterator itr=sayilar.iterator();

        while (itr.hasNext()){


            if (itr.next().equals(10)){

                System.out.println(itr.next().toString());

            }
        }
    }
}

