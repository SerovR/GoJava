package ua.goit.gojavaonline.core_3.groupe_02.serov.module04.Zadacha2;


public class TemperatureConvertor {

    public double ConvertFarenheitToCelsius(double FarenheitDegree) {
        return (FarenheitDegree - 32) * 5 / 9;
    }

    public double ConvertCelciusToFarenheit(double CelsiusDegree) {
        return (CelsiusDegree * 9 / 5) + 32;
    }

}

