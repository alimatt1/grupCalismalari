package grupCalismasi6;

import java.time.LocalDate;

public class C2 {
    public static void main(String[] args) {
        //Ali, 29 Ekim 1923'ten 45 yıl 8 ay 5 gün sonra doğmuştur.
        //Veli, 15 Eylül 1993'ten 24 yıl 2 ay 11 gün önce doğmuştur.
        //Ali ve Veli'nin kesin doğum tarihini hesaplamak için kodu yazınız.
        //Ali ve Veli'nin doğum tarihinin aynı olup olmadığını kontrol etmek için kodu yazınız.

        LocalDate ali= LocalDate.of(1923,10,29).plusYears(45).plusMonths(8).plusDays(5);
        System.out.println(ali);//1969-07-04

        LocalDate veli=LocalDate.of(1993,9,15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(veli);//1969-07-04

        System.out.println(ali.equals(veli));//true


    }
}
