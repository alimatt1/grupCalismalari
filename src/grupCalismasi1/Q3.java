package grupCalismasi1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        //Array kullanarak String bir cümleyi Reverse eden (tersine çeviren)
        // bir Java programı yazın (boşluklar ve özel karakterler dahil).
        //Örnek:
        //String str=''Kodlama harika.''
        //String arr[]: ".etaerg si gnidoC"
        //İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın.

        String str="kodlama ogrenmeye calisiyorum";
        str.replaceAll(" ","");
        String[] tersStr=str.split("");
        Arrays.toString(tersStr);

        List<String> reverse= new ArrayList<>();

        for (int i = tersStr.length-1; i >=0 ; i--) {
            reverse.add(tersStr[i]);


        }
        System.out.println(reverse);


    }
}
