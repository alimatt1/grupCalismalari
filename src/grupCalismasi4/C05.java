package grupCalismasi4;

import java.util.ArrayList;
import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        //Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
        //yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
        //method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
        //gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
        // kazandığını gösteren bir method yazınız.
        //
        // * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
        //   2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
        //   3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
        //   4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
        //   5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama
        //             kazançtan yüksekse o günleri return yap.
        //   6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
        //             ortalama kazançtan aşağıysa o günleri return yap.

        ArrayList<String> gunler = new ArrayList<>();
        gunler.add("pazartesi");
        gunler.add("sali");
        gunler.add("carsamba");
        gunler.add("persembe");
        gunler.add("cuma");
        gunler.add("cumartesi");
        gunler.add("pazar");
        //System.out.println(gunler);//[pazartesi, sali, carsamba, persembe, cuma, cumartesi, pazar]

        ArrayList<Double> gunlukKazanclar = new ArrayList<>();


        int gunSayisi = 1;
        while (gunSayisi < 8) {
            System.out.println("gunluk kazancinizi giriniz");
            Scanner scan = new Scanner(System.in);
            double gunkK = scan.nextDouble();
            gunlukKazanclar.add(gunkK);
            gunSayisi++;

        }
        System.out.println("bakkalimizin haftalik ortalama kazanci = " + getOrtalamaKazanc(gunlukKazanclar));
        double ortalama=getOrtalamaKazanc(gunlukKazanclar);

        System.out.println("Ortalamanin uzerinde kazanilan gunler = " +getOrtalamaninUstundeKazancGunleri(gunler, gunlukKazanclar, ortalama));//

        System.out.println("Ortalamanin altinda kazanilan gunler = " +getOrtalamaninAltindaKazancGunleri(gunler, gunlukKazanclar, ortalama));

    }

    private static ArrayList<String> getOrtalamaninAltindaKazancGunleri(ArrayList<String> gunler, ArrayList<Double> gunlukKazanclar,Double ortalama) {

        ArrayList<String> underTheAverage=new ArrayList<>();

        for (int i = 0; i < gunler.size() ; i++) {
            if (gunlukKazanclar.get(i)< ortalama){
                underTheAverage.add(gunler.get(i));
            }

        }

        return underTheAverage;
    }


    private static ArrayList<String> getOrtalamaninUstundeKazancGunleri(ArrayList<String> gunler, ArrayList<Double> gunlukKazanclar,Double ortalama) {

        ArrayList<String> aboveTheAverage=new ArrayList<>();

        for (int i = 0; i < gunler.size() ; i++) {
            if (gunlukKazanclar.get(i)>= ortalama){
                aboveTheAverage.add(gunler.get(i));
            }

        }

        return aboveTheAverage;
    }

    private static double getOrtalamaKazanc(ArrayList<Double> gunlukKazanclar) {
        double toplam=0;
        double ortalama=0;

        for (Double each : gunlukKazanclar) {
            toplam += each;
            ortalama = toplam / 7;

        }
        return ortalama;

    }


}
