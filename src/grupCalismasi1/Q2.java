package grupCalismasi1;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        //Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
        //İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin...

        int[] arr={1,2,3,4,4,5,5,6,6,34,61,4,3,2,1};
        List<Integer> reverse=new ArrayList<>();

        for (int i = arr.length-1; i >=0 ; i--) {
            reverse.add(arr[i]);

        }
        System.out.println(reverse);

        int [] rra={9,8,7,6,5,4,3,2,1,0};
        List<Integer>Ters=new ArrayList<>();

        for (int i = rra.length-1; i >=0 ; i--) {

            Ters.add(rra[i]);
        }
        System.out.println(Ters);

    }
}
