package ua.goit.gojavaonline.core_3.groupe_02.serov.module05;


import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        int[] array = {2, 3, 8, 6, 34, 23, 13};
        System.out.println("Min element in array = " + ArrayUtils.searchMin(array));
        System.out.println("Max element in array = " + ArrayUtils.searchMax(array));
        System.out.println("Изначальный массив: " + Arrays.toString(array));
        ArrayUtils.sort(array);
        System.out.println("Отсортированый массив: " + Arrays.toString(array));
    }


}
