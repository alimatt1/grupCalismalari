package grupCalismasi8;

import java.util.Arrays;
import java.util.LinkedList;

public class C1 {

    public static void main(String[] args) {
        //Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Her giriş satırındaki ilk
        //ve son sözcükler dışındaki sözcüklerin sırasını tersine çevirip sözcükleri değiştirmeden
        //kodu yazınız.
        //Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
        //Örnek; Kemal Can Tan Han Kuzu, Kemal Han Tan Can Kuzu'ya dönüşecektir.


        /*
        LinkedList<String> isimler=new LinkedList<>();

        isimler.add("Kemal");
        isimler.add("can");
        isimler.add("tan");
        isimler.add("han");
        isimler.add("kuzu");

        System.out.println(isimler);//[Kemal, can, tan, han, kuzu]
        */
        String input = "Ali\n" +
                "Veli Can Han\n" +
                "Kemal Can Tan Kuzu\n" +
                "Kemal Can Tan Han Kuzu\n" +
                "Kemal Can Tan Han Man Kuzu";

        String[] lines = input.split(System.getProperty("line.separator"));

        System.out.println(Arrays.toString(lines));//

        for(String w : lines) {
            String[] words = w.split(" ");
            String rev = words[0] + " ";

            for (int i = words.length - 2; i >= 1; i--) {
                rev = rev + words[i] + " ";
            }
            rev = rev + words[words.length-1];
            System.out.println(rev);
            rev="";
        }
    }
}
