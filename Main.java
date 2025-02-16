package edu.ucalgary.oop;

public class Main {

    // The main() method is used to demonstrate the output
    public static void main(String[] args) {
        // Step 1: Declare variables
        int intValue = 100;
        double doubleValue = 4;
        char charValue = 'A';

        // Step 2: Call methods and print results
        System.out.println("Auto-cast int to double: " + intToDouble(intValue));
        System.out.println("Explicit-cast double to int: " 
           + doubleToInt(doubleValue));
        System.out.println("New char from char 'G': " 
           + charToAsciiAndNewChar(charValue));
    }

    // Method 1: int to double (stub)
    public static double intToDouble(int value) {
        // TODO: Implement this method
        double ConvdoubleValue = value;
        return ConvdoubleValue;

    }

    // Method 2: double to int (stub)
    public static int doubleToInt(double value) {
        // TODO: Implement this method
        int ConvintValue = (int) value;
        return ConvintValue;
    }

    // Method 3: char to new char via ASCII (stub)
    public static char charToAsciiAndNewChar(char value) {
        // TODO: Implement this method
        int charIntValue = value;
        int newCharIntValue = charIntValue + 3;
        char convertedIntChar = (char) newCharIntValue;
        return convertedIntChar;


    }
}

