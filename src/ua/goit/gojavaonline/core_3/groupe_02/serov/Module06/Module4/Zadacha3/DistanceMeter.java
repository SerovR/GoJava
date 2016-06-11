package ua.goit.gojavaonline.core_3.groupe_02.serov.Module06.Module4.Zadacha3;

import static java.lang.Math.pow;

public class DistanceMeter {
    public static double distanceCalculate(Point point1, Point point2) {
        return Math.sqrt(pow((point1.getX() - point2.getX()), 2) +
                pow((point1.getY() - point2.getY()),2));


    }
}
