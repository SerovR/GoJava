package ua.goit.gojavaonline.core_3.groupe_02.serov.module04;

import java.util.Scanner;

public class Points {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" введите x1: ");
        int x1 = scanner.nextInt();
        System.out.println(" введите x2: ");
        int x2 = scanner.nextInt();
        System.out.println(" введите y1: ");
        int y1 = scanner.nextInt();
        System.out.println(" введите y2: ");
        int y2 = scanner.nextInt();
        double result = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println("расстояние между двумя точками:" + result);
    }
}


