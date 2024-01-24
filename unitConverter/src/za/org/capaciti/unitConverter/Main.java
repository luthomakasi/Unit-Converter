package za.org.capaciti.unitConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Unit Converter");
        System.out.print("Enter the unit to convert from (feet, pounds, fahrenheit): ");
        String fromUnit = scanner.nextLine().toLowerCase();

        System.out.print("Enter the unit to convert to (meters, kgs, celsius): ");
        String toUnit = scanner.nextLine().toLowerCase();

        System.out.print("Enter the quantity to be converted: ");
        double quantity = scanner.nextDouble();

        double result = convert(fromUnit, toUnit, quantity);
        System.out.println(quantity + " " + fromUnit + " is equal to " + result + " " + toUnit);

        scanner.close();
    }
    
    
    

    private static double convert(String fromUnit, String toUnit, double quantity) {
        switch (fromUnit) {
            case "feet": return quantity * 0.3048;
            case "pounds": return quantity * 0.453592;
            case "fahrenheit": return (quantity - 32) * 5 / 9;
            default:
                System.out.println("Invalid unit");
                return 0;
        }
    }
}

