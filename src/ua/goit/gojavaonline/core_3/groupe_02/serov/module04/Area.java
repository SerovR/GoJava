package ua.goit.gojavaonline.core_3.groupe_02.serov.module04;
import java.util.Scanner;
import  java.lang.Math;
public class Area {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту треугольника: ");
        int heightTriangle = scanner.nextInt();
        System.out.println("Введите ширину треугольника: ");
        int baseTriangle = scanner.nextInt();
        int areaTriangle = (baseTriangle * heightTriangle)/2;
        System.out.println("Площадь треугольника равна: " + areaTriangle);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите основу прямоугольника: ");
        int heightRectangle = sc.nextInt();
        System.out.println("Введите высоту прямоугольника: ");
        int baseRectangle = sc.nextInt();
        int areaRectangle = (baseRectangle * heightRectangle);
        System.out.println("Площадь треугольника равна: " + areaRectangle);

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");
        double radiusCircle = scan.nextDouble();
        double areaCircle = (Math.PI * Math.pow(radiusCircle, 2));
        System.out.println("Площадь круга равна: " + areaCircle);

    }
}
