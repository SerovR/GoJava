package ua.goit.gojavaonline.core_3.groupe_02.serov.module05;


public class SortArray {

    public static int[] sort(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            for (int index = 0; index < i; index++) {
                if (array[index] > array[index + 1]) {
                    swap(array, index);
                }
            }
        }
        return array;
    }

    public static void swap(int[] array, int k) {
        int tmp = array[k];
        array[k] = array[k + 1];
        array[k + 1] = tmp;
    }
}


