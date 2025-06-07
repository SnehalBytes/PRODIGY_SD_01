import java.util.Scanner;
public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature value: ");
        double value = scanner.nextDouble();
        
        System.out.print("Enter the unit (c for Celsius, f for Fahrenheit, k for Kelvin): ");
        char unit = scanner.next().charAt(0);
        
        switch (unit) {
            case 'c':
                System.out.printf("Fahrenheit: %.2f\n", celsiusToFahrenheit(value));
                System.out.printf("Kelvin: %.2f\n", celsiusToKelvin(value));
                break;
            case 'f':
                System.out.printf("Celsius: %.2f\n", fahrenheitToCelsius(value));
                System.out.printf("Kelvin: %.2f\n", fahrenheitToKelvin(value));
                break;
            case 'k':
                System.out.printf("Celsius: %.2f\n", kelvinToCelsius(value));
                System.out.printf("Fahrenheit: %.2f\n", kelvinToFahrenheit(value));
                break;
            default:
                System.out.println("Invalid unit! Please enter c, f, or k.");
        }
        
        scanner.close();
    }
}