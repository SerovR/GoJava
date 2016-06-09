package ua.goit.gojavaonline.core_3.groupe_02.serov.module05;


import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        int [] array = {2,3,8,6,34,23,13};
        System.out.println("Min element in array = " + SearchMinMax.searchMin(array));
        System.out.println("Max element in array = " + SearchMinMax.searchMax(array));
        for (int v : array)
            System.out.println(v);

        SortArray.sort(array);

        for (int v : array)
            System.out.println(v);

    }


}
