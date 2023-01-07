package grupCalismasi6;

import java.util.Arrays;

public class C1 {
    // 2 String girmesini isteyiniz. Stringlerin karakterleri ve
    // karakter sayıları aynıysa konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
    //Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.

    public static void main(String[] args) {

        String kelime1="Zaman";
        String kelime2="namaz";

        String[] temp1=kelime1.toUpperCase().split("");
        Arrays.sort(temp1);
        System.out.println(Arrays.toString(temp1));//[A, A, M, N, Z]

        String[] temp2=kelime2.toUpperCase().split("");
        Arrays.sort(temp2);
        System.out.println(Arrays.toString(temp2));//[A, A, M, N, Z]


        System.out.println(kelime2.equalsIgnoreCase(kelime1));//false

        if (temp2.length!= temp1.length){
            System.out.println("kelime anagram degil");

        } else if (Arrays.equals(temp2,temp1)) {
            System.out.println("kelime anagramdir");

        }else
            System.out.println("kelime anagram degildir.");


    }
}
