package ua.goit.gojavaonline.core_3.groupe_02.serov.Module06.Module4.Zadacha1;

/**
 * Created by Роман on 11.06.2016.
 */
public class Runner {
    public static void main(String[] args) {
        double result;
try {
    result = AreaCalculation.AreaTriangle(13 , 5);
    System.out.println(result);
}
catch (IllegalArgumentException e)
{
    System.out.println("Triangle area can not be negative");
}
try {
    result = AreaCalculation.AreaRectangle(32, 3);
    System.out.println(result);
}
catch (IllegalArgumentException e1)
{
    System.out.println("Rectangle area can not be negative");
}
        try {
            result = AreaCalculation.AreaCircle(4);
            System.out.println(result);
        }
        catch (IllegalArgumentException e2)
        {
            System.out.println("circle area can not be negative");
        }


    }

}
