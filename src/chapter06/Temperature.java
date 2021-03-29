package chapter06;

public class Temperature {
    /*6.8 (Conversions between Celsius and Fahrenheit) Write a class that contains the fol-
        lowing two methods:
        Convert from Celsius to Fahrenheit
        public static double celsiusToFahrenheit(double celsius)
        /** Convert from Fahrenheit to Celsius
        public static double fahrenheitToCelsius(double fahrenheit)
        The formula for the conversion is:
        fahrenheit = (9.0 / 5) * celsius + 32
        celsius = (5.0 / 9) * (fahrenheit – 32) */
    public static void main(String[] args) {
        printTemeratureTable();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static void printTemeratureTable() {
        System.out.println("Celsius Fahrenheit | Fahrenheit Celsius");
        for (int i = 40, j = 120; i > 30; i--, j -= 10) {
            System.out.println(i + "  " + celsiusToFahrenheit(i) + "  |  " + j + "  " + fahrenheitToCelsius(j));
        }
    }

}
