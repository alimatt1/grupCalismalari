package grupCalismasi10;/*package grupCalismasi10;

import java.util.Arrays;
import java.util.Collection;

public class C02 {
    public static void main(String[] args) {

        //Write a Java program to replace every element with the
        // next greatest element (from right side) in a given array of integers.
        // There is no element next to the last element, therefore replace it with -1.
        //{20, 100, 23, -5, 2, -6, -1}

 */
import java.io.*;
import java.util.Arrays;
        public class Main{
            public static void main (String[] args)
            {
                int nums[] = {45, 20, 100, 23, -5, 2, -6};
                int result[];
                System.out.println("Original Array ");
                System.out.println(Arrays.toString(nums));

                result = next_greatest_num(nums);
                System.out.println("The modified array:");
                System.out.println(Arrays.toString(result));
            }

            static int [] next_greatest_num(int arr_nums[])
            {
                int size = arr_nums.length;
                int max=  arr_nums[size-1];
                arr_nums[size-1] = -1;

                for (int i = size-2; i >= 0; i--)
                {
                    int temp = arr_nums[i];
                    arr_nums[i] = max;
                    if(max < temp)
                        max= temp;
                }
                return arr_nums;
            }
        }



/*
        int[] numaralar = {45, 20, 100, 23, -5, 2, -6};

        int [] yeniArr = new int[numaralar.length];

        Arrays.sort(numaralar);
        System.out.println(Arrays.toString(numaralar));//[-6, -5, 2, 20, 23, 45, 100]

        int uzunluk=numaralar.length;

        for (int i = uzunluk-1; i >0 ; i--) {
            yeniArr[i-1]=numaralar[i];


        }


        System.out.println(Arrays.toString(yeniArr));//
/*
        for (int i = 1; i<; i--) {

            yeniArr[i]=yeniArr[i-1];

        }
        System.out.println(yeniArr);//
*/


