package grupCalismasi10;

import java.util.Arrays;

public class C02 {
    public static void main(String[] args) {


    int[] numaralar = {45, 20, 100, 23, -5, 2, -6};

    int [] yeniArr = new int[numaralar.length];

        Arrays.sort(numaralar);
        System.out.println(Arrays.toString(numaralar));//[-6,-5,2,20,23,45,100]

    int uzunluk =numaralar.length;


        for (int i = 0; i<=numaralar.length-1 ; i++) {
        yeniArr [i]=numaralar[uzunluk-1];
        uzunluk--;

    }

        yeniArr[yeniArr.length-1]=-1;
        System.out.println(Arrays.toString(yeniArr));

}
}
