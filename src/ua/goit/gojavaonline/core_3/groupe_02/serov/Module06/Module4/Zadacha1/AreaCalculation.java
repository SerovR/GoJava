package ua.goit.gojavaonline.core_3.groupe_02.serov.Module06.Module4.Zadacha1;

public class AreaCalculation {

    public static double AreaTriangle(double height, double base) {
        return (base * height) / 2;
    }

    public static double AreaRectangle(double height, double base) {
        return base * height;
    }
    public static double AreaCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }


}
