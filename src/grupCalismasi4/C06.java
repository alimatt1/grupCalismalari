package grupCalismasi4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C06 {
    //* Basit bir 5 ürünlü manav alisveris programi yaziniz.
    //
    //   1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
    //   2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
    //          Bu islemi alisverisn bitirmek isteyene kadar tekrarla.
    //   3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
    //   4. Adim : Alisveris bitince toplam odemesi gereken tutari goster

    static ArrayList<String> fruits= new ArrayList<>(Arrays.asList("pineapple","orange","banana","apple","blackberries"));

    static ArrayList<Double> prices= new ArrayList<>(Arrays.asList(1.5,3.0,0.45,1.56,1.99));

    static double total= 0;

    static Scanner scan=new Scanner(System.in);



    public static void main(String[] args) {
        System.out.println("######## MEDITERRANEAN MARKET ########");
        shopping();


    }

    private static void shopping() {

        for (int i = 1; i <=5; i++) {
            System.out.println(i+" "+  fruits.get(i-1) + " is " + prices.get(i-1) + " dolars ");

        }
        System.out.println("please choose fruit");
        int urun= scan.nextInt();

        System.out.println("please enter amount");
        int miktar=scan.nextInt();
        total+=miktar* prices.get(urun-1);


        System.out.println("contuniue or finish");
        char cOrF=scan.next().charAt(0);


        if (cOrF=='c'|| cOrF=='C'){
            shopping();
        } else if (cOrF=='f'|| cOrF=='F') {
            System.out.println("total amount = " + total);
        }else
            System.out.println("please try again");
    }
}
