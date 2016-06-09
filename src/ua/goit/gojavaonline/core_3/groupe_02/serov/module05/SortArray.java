package ua.goit.gojavaonline.core_3.groupe_02.serov.module05;


public class SortArray {

    public static int[] sort(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            for (int index = 0; index < i; index++) {
                if (array[index] > array[index + 1]) {
                    int tmp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = tmp;
                }
            }
        }
        return array;
    }

}


