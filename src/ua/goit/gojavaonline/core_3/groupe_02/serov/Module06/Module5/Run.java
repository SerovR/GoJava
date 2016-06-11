package ua.goit.gojavaonline.core_3.groupe_02.serov.Module06.Module5;


import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        try {
            int[] array = {3,4,7,9,2,1,98,78};
            System.out.println("Min element in array = " + ArrayUtils.searchMin(array));
            System.out.println("Max element in array = " + ArrayUtils.searchMax(array));
            System.out.println("Изначальный массив: " + Arrays.toString(array));
            ArrayUtils.sort(array);
            System.out.println("Отсортированый массив: " + Arrays.toString(array));
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Количество елементов должно быть больше нуля");
        }


    }


}
