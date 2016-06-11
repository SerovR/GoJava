package ua.goit.gojavaonline.core_3.groupe_02.serov.Module06.Module4.Zadacha1;

public class AreaCalculation {

    public static double AreaTriangle(double height, double base) {

        if (height<0 || base<0)
        {
            throw new IllegalArgumentException("Площадь не может быть отрицательной");
        }

        return (base * height) / 2;
    }

    public static double AreaRectangle(double height, double base) {
        if (height<0 || base<0)
        {
            throw new IllegalArgumentException("Площадь не может быть отрицательной");
        }
        return base * height;
    }

    public static double AreaCircle(double radius) {
        if (radius<0)
        {
            throw new IllegalArgumentException("Площадь не может быть отрицательной");
        }

            return Math.PI * Math.pow(radius, 2);


    }


}
