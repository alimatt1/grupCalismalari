package grupCalismasi7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C1{
    /*
        Bir ogretmenden ogrencilerin notlarini girmesini isteyin, not grime islemi
        bittiginde Q’ya basmalidir. Not grime islemi bittikten sonra asagidaki sekilde
        output hazirlayin
        not ortalamasi : …..
        ogrenci sayisi : …..
        ortalama altindaki ogrenci sayisi : ….
        ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi : …*/
    static int ogrenciSayisi=0;
    static double toplamnot=0;

    static int ortalamaAltOgr=0;
    static  int ortalamanin10puanUstu=0;
    static  int ortalamanin10puanAlti=0;
    static   Scanner scan=new Scanner(System.in);

    static List<Double> notlar=new ArrayList<>();

    public static void main(String[] args) {


        System.out.println("Eklemek istediginiz ogrenci notunu giriniz. Islemi birimek icin Q basiniz");

        boolean bayrak =true;

        while (bayrak){

            try {
                double girilenNot=scan.nextDouble();
                notlar.add(girilenNot);
                ogrenciSayisi++;
                toplamnot+=girilenNot;


            } catch (Exception e) {
                String girilenDeger=scan.nextLine();
                if (girilenDeger.equalsIgnoreCase("Q")){
                    double ortalama= toplamnot/ogrenciSayisi;


                    for (Double each:notlar){

                        if (each<ortalama){
                            ortalamaAltOgr++;
                        }
                        if (each<=(ortalama-10)) {

                            ortalamanin10puanAlti++;

                        }
                        if (each>=ortalama+10){
                            ortalamanin10puanUstu++;
                        }
                    }

                    System.out.println("Not ortalamasi : "+ ortalama);
                    System.out.println("Ogrenci sayisi : "+ ogrenciSayisi);
                    System.out.println("Ortalamanin Altindaki ogrenci sayisi: "+ ortalamaAltOgr);
                    System.out.println("Ortalamanin 10 puan Altindaki ogrenci sayisi: "+ ortalamanin10puanAlti);
                    System.out.println("Ortalamanin 10 puan Ustundeki ogrenci sayisi: "+ ortalamanin10puanUstu);

                    bayrak=false;
                }else{

                    System.out.println("Gecersiz input.Programi yeniden baslatin.");
                }
            }
        }
    }
}