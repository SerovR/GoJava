package ua.goit.gojavaonline.core_3.groupe_02.serov.Module06.Module4.Zadacha2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class RunCelsiusToFarenheit {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите температуру по цельсию: ");
            double TemperatureCelsius = scanner.nextDouble();
            TemperatureConvertor znacheie = new TemperatureConvertor();
            System.out.println("Преобразованая температура из шкалы Цельсия в шкалу Фаренгейта = " + znacheie.ConvertCelciusToFarenheit(TemperatureCelsius));
        }
        catch (InputMismatchException e)
        {
            System.out.println("Введите числовое значение температуры");
        }

    }
}
