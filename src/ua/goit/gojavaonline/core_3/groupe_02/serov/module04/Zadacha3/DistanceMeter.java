package ua.goit.gojavaonline.core_3.groupe_02.serov.module04.Zadacha3;

public class DistanceMeter {
    public static double distanceCalculate(Points point1, Points point2) {
        return Math.sqrt(((point1.getX() - point2.getX()) * (point1.getX() - point2.getX())) +
                ((point1.getY() - point2.getY()) * (point1.getY() - point2.getY())));


    }
}
