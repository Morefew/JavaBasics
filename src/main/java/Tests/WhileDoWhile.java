package Tests;

import java.util.Scanner;

public class WhileDoWhile {
    public double addition(double addendFirst, double addendSecond) {
        return addendFirst + addendSecond;
    }

    public double subtraction(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    public double multiplication(double multiplicand, double multiplier) {
        return multiplicand * multiplier;
    }

    public double division(double dividend, double divisor) {
        return dividend / divisor;
    }

    public static void main(String[] args) {


        double firstNumber;
        double secondNumber;
        double calculatedAnswer;
        int calculationToPerform;
        WhileDoWhile w = new WhileDoWhile();
        Scanner in = new Scanner(System.in);

        // Start of the Calculator`s logic

        // SELECTION PANEL
        System.out.println("           SIMPLE CALCULATOR            ");
        System.out.println("SELECT THE CALCULATION YOU WANT TO PERFORM");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        calculationToPerform = in.nextInt();

        // Calculations Logic
        switch (calculationToPerform) {
            // calculation additions
            case 1 -> {
                System.out.println("Input first addend to be calculated, or 0 to exit: ");
                firstNumber = in.nextDouble();
                while (firstNumber != 0) {
                    System.out.println("Input second addend to be calculated");
                    secondNumber = in.nextDouble();
                    System.out.println("You entered: " + firstNumber + " and " + secondNumber);
                    calculatedAnswer = w.addition(firstNumber, secondNumber);
                    System.out.println("This operation equals: " + calculatedAnswer);
                    System.out.println("------------------------------------------");
                    System.out.println();
                    System.out.println("Input first addend to be calculated, or 0 to exit: ");
                    firstNumber = in.nextDouble();
                }
            }
            // calculation subtractions
            case 2 -> {
                System.out.println("Input Minuend to be calculated, or 0 to exit: ");
                firstNumber = in.nextDouble();
                while (firstNumber != 0) {
                    System.out.println("Input Subtrahend to be calculated");
                    secondNumber = in.nextDouble();
                    System.out.println("You entered: " + firstNumber + " and " + secondNumber);
                    calculatedAnswer = w.subtraction(firstNumber, secondNumber);
                    System.out.println("This operation equals: " + calculatedAnswer);
                    System.out.println("------------------------------------------");
                    System.out.println();
                    System.out.println("Input first addend to be calculated, or 0 to exit: ");
                    firstNumber = in.nextDouble();
                }
            }
            // calculation multiplications
            case 3 -> {
                System.out.println("Input Multiplicand to be calculated, or 0 to exit: ");
                firstNumber = in.nextDouble();
                while (firstNumber != 0) {
                    System.out.println("Input Multiplier to be calculated");
                    secondNumber = in.nextDouble();
                    System.out.println("You entered: " + firstNumber + " and " + secondNumber);
                    calculatedAnswer = w.multiplication(firstNumber, secondNumber);
                    System.out.println("This operation equals: " + calculatedAnswer);
                    System.out.println("------------------------------------------");
                    System.out.println();
                    System.out.println("Input first addend to be calculated, or 0 to exit: ");
                    firstNumber = in.nextDouble();
                }
            }
            // calculation division
            case 4 -> {
                System.out.println("Input Dividend to be calculated, or 0 to exit: ");
                firstNumber = in.nextDouble();
                while (firstNumber != 0d) {
                    System.out.println("Input Divisor to be calculated");
                    secondNumber = in.nextDouble();
                    System.out.println("You entered: " + firstNumber + " and " + secondNumber);
                    calculatedAnswer = w.division(firstNumber, secondNumber);
                    System.out.println("This operation equals: " + calculatedAnswer);
                    System.out.println("------------------------------------------");
                    System.out.println();
                    System.out.println("Input first addend to be calculated, or 0 to exit: ");
                    firstNumber = in.nextDouble();
                }
            }
        }
    }
}

