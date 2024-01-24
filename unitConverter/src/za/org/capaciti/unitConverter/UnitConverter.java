package za.org.capaciti.unitConverter;

import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display welcome message
        System.out.println("Welcome to the Unit Converter!");
        System.out.println("========================================================\n");
        
        System.out.println("Choose the conversion you want to perform:");
        System.out.println();

        // Display conversion options
        System.out.println("1. Feet to Meters");
        System.out.println("2. Pounds to Kilograms");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println();

        
        // Get user input for conversion type
        int choice = Integer.parseInt(scanner.nextLine());
        System.out.println();
        
        // Validate user input
        if (choice < 1 || choice > 3) {
            System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            System.out.println();
            return;
        }

        
        // Get user input for units and quantity
        System.out.print("Enter the quantity you want to convert: ");
        double quantity = Double.parseDouble(scanner.nextLine());
        System.out.println();

        
        
        // Perform conversion based on user choice
        double result;
        switch (choice) {
            case 1:
                result = feetToMeters(quantity);
                System.out.printf("%.2f feet is equal to %.2f meters.\n", quantity, result);
                System.out.println();
                break;
            case 2:
                result = poundsToKgs(quantity);
                System.out.printf("%.2f pounds is equal to %.2f kilograms.\n", quantity, result);
                System.out.println();
                break;
            case 3:
                result = fahrenheitToCelsius(quantity);
                System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius.\n", quantity, result);
                System.out.println();
                break;
        }

        System.out.println("Thank you for using the Unit Converter!");
        System.out.println("========================================================\n");
        
        scanner.close();
    }

    
    
    
    // Conversion methods with validation
    private static double feetToMeters(double feet) {
        if (feet < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        return feet * 0.3048;
    }

    private static double poundsToKgs(double pounds) {
        if (pounds < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        return pounds * 0.453592;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
