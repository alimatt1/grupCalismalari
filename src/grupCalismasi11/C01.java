package grupCalismasi11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01 {
    public static void main(String[] args) {
        //Write a Java program to sort an array of
        // positive integers of a given array,
        // in the sorted array the value of the
        // first element should be maximum,
        // second value should be minimum value, third should be second maximum,
        // fourth second be second minimum and so on.


        int[] arr = {11, 2, 3, 66, 55, 99, 77, 4, 5, 8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[2, 3, 4, 5, 8, 11, 55, 66, 77, 99]

        int[] newArr = new int[arr.length];

        boolean flag = true;
        int i = 0;
        int diger=arr.length;
        int ucuncu=0;

        while (flag) {
            if (i <= (arr.length)-1) {
                newArr[i] = arr[diger-1];
                newArr[i + 1] = arr[ucuncu];
                i+=2;
                diger--;
                ucuncu++;

            }else
                flag=false;

        }
        System.out.println(Arrays.toString(newArr));//
    }
}
