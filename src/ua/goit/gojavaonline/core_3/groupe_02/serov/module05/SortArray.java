package ua.goit.gojavaonline.core_3.groupe_02.serov.module05;


import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {


        int[] intArray = {2, 4, 7, 1, 9, 8, 28, 17, 15,12,12};

        for (int i = intArray.length-1; i >=1; i--)
        {
            for (int index =0; index < i; index++)
            {
                if (intArray[index]>intArray[index+1])
                {
                    swap(intArray,index);
                }
            }
        }

        System.out.println(Arrays.toString(intArray));
    }
    private static void swap(int [] array, int k)
    {
        int tmp = array[k];
        array [k]=array[k+1];
        array[k+1]=tmp;
    }
}
