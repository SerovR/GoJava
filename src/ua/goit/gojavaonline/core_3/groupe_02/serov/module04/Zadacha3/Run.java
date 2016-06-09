package ua.goit.gojavaonline.core_3.groupe_02.serov.module04.Zadacha3;


public class Run {
    public static void main(String[] args) {
        Point point1 = new Point(2, 3);
        Point point2 = new Point(4, 6);
        System.out.println("расстояние между двумя точками: " + DistanceMeter.distanceCalculate(point1, point2));
    }
}
