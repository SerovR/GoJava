package ua.goit.gojavaonline.core_3.groupe_02.serov.module04.Zadacha3;


public class Run {
    public static void main(String[] args) {
        Points point1 = new Points(2, 3);
        Points point2 = new Points(4, 6);
        System.out.println("расстояние между двумя точками: " + DistanceMeter.distanceCalculate(point1, point2));
    }
}
