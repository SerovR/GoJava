package ua.goit.gojavaonline.core_3.groupe_02.serov.module04;


import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру по цельсию: ");
        double TemperatureCelsius = scanner.nextDouble();
        double TemperatureFahrenheit = (TemperatureCelsius * 9/5) + 32;
        System.out.println("Преобразованая температура из шкалы Цельсия в шкалу Фаренгейта = " + TemperatureFahrenheit);

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите температуру по Фаренгейту: ");
        double TemperatureFahr = scan.nextDouble();
        double TemperatureCel = (TemperatureFahr - 32) * 5/9;
        System.out.println("Преобразованая температура из шкалы Фаренгейта в шкалу Цельсия  = " + TemperatureCel);


    }
}
