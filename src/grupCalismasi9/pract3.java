package grupCalismasi9;

import java.util.Arrays;
import java.util.Scanner;

public class pract3 {
    // Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
    //olusturun.
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        // s();

        kiyas(s());


    }
    public static String[] s() {

        System.out.println("String arrayin boyutunu giriniz: " );
        String[] str=new String[sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < str.length; i++) {
            System.out.println("Arrayin"+(i+1)+". elementini giriniz: ");
            str[i]= sc.nextLine();

        }
        System.out.println(Arrays.toString(str));
        return str;
    }




    public static void kiyas(String[] str1){
        System.out.println("Kiyas methodu calisti");
        System.out.println(str1[1]);
        int enUzun=str1[0].length();
        int enKisa=str1[0].length();
        String enUzunS=str1[0];
        String enKisaS=str1[0];
        for (int i = 0; i < str1.length; i++) {

            if (str1[i].length()>enUzun){
                enUzun=str1[i].length();
                enUzunS=str1[i];
            }
            if (str1[i].length()<enKisa){
                enKisa=str1[i].length();
                enKisaS=str1[i];
            }

        }
        System.out.println("Verilen String Arrayin EN Uzun Elementi: "+ enUzunS);
        System.out.println("Verilen String Arrayin EN Kisa Elementi: "+ enKisaS);
    }

}
