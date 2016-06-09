package ua.goit.gojavaonline.core_3.groupe_02.serov.module04.Zadacha2;

import ua.goit.gojavaonline.core_3.groupe_02.serov.module04.Zadacha2.TemperatureConvertor;

import java.util.Scanner;


public class RunCelsiusToFarenheit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру по цельсию: ");
        double TemperatureCelsius = scanner.nextDouble();
        TemperatureConvertor znacheie = new TemperatureConvertor();
        System.out.println("Преобразованая температура из шкалы Цельсия в шкалу Фаренгейта = " + znacheie.ConvertCelciusToFarenheit(TemperatureCelsius));
    }
}
