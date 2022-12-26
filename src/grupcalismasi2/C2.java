package grupcalismasi2;

import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        //Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
        //Changename adında bir method oluşturun,
        // parametre olarak öğrenci bilgileri alın ve methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
        //Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
        //Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
        // Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.


        String ogrenciIsmi="burhan";
        String ogrenciSoyIsim="altintop";

        Changename(ogrenciIsmi,ogrenciSoyIsim);
        Changesurname(ogrenciSoyIsim);


        //Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
        Rename(ogrenciIsmi,ogrenciSoyIsim);



    }

    private static void Changesurname(String lastname) {
        //Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
        // Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir soy isim giriniz");
        String surname=scan.next();
        System.out.println("Changesurname :" +"yeni soy isim = " + surname);


    }
    private static void Changename(String name,String surname) {
// parametre olarak öğrenci bilgileri alın ve methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
        name="ali";
        surname="demir";
        System.out.println("Changename " +name+ " " +surname);



    }
    private static void Rename(String name,String lastname) {
        name="furkan";
        lastname="kelebek";
        System.out.println("Rename " + name+" " +lastname);




    }
}
