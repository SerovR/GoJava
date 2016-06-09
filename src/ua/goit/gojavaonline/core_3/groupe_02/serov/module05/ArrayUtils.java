package ua.goit.gojavaonline.core_3.groupe_02.serov.module05;


public class ArrayUtils {

    public static void sort(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            for (int index = 0; index < i; index++) {
                if (array[index] > array[index + 1]) {
                    int tmp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = tmp;
                }
            }
        }
    }
    public static int searchMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int searchMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}


