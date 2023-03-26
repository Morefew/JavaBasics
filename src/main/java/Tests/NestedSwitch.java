package Tests;

import java.util.Scanner;

public class NestedSwitch {
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

    public double powerTo(double base, double power) {

        double pow = 1;
        for (; power!= 0; power--) {
            pow = pow * base;
        }
        return pow;
    }


    public static void main(String[] args) {


        double firstNumber;
        double secondNumber;
        double calculatedAnswer;
        double squaredAnswer;
        int calculationToPerform;
        NestedSwitch dw = new NestedSwitch();
        Scanner in = new Scanner(System.in);

        // Start of the Calculator`s logic

        // SELECTION PANEL
        System.out.println("           SIMPLE CALCULATOR            ");
        System.out.println("SELECT THE CALCULATION YOU WANT TO PERFORM");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 0 to EXIT");
        calculationToPerform = in.nextInt();

        // Calculations Logic
        switch (calculationToPerform) {
            // calculate additions
            case 1 -> {
                int selection;
                System.out.println("Input first addend to be calculated, or 0 to exit: ");
                firstNumber = in.nextDouble();
                while (firstNumber != 0) {
                    System.out.println("Input second addend to be calculated");
                    secondNumber = in.nextDouble();
                    System.out.println("You entered: " + firstNumber + " and " + secondNumber);
                    System.out.println("Do you want the result or to raise by the second number");
                    System.out.println("Press 1 for result");
                    System.out.println("Press 2 to raise");
                    selection = in.nextInt();
                    switch (selection) {
                        case 1 -> {
                            calculatedAnswer = dw.addition(firstNumber, secondNumber);
                            System.out.println("This operation equals: " + calculatedAnswer);
                            System.out.println("------------------------------------------");
                            System.out.println();
                            System.out.println("Input first addend to be calculated, or 0 to exit: ");
                            firstNumber = in.nextDouble();
                        }
                        case 2 -> {
                            double poweredResult = dw.powerTo(firstNumber,secondNumber);
                            System.out.println("This operation equals: " + poweredResult);
                            System.out.println("------------------------------------------");
                            System.out.println();
                            System.out.println("Input first addend to be calculated, or 0 to exit: ");
                            firstNumber = in.nextDouble();
                        }
                        default -> firstNumber = 0;
                    }
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
                    calculatedAnswer = dw.subtraction(firstNumber, secondNumber);
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
                    calculatedAnswer = dw.multiplication(firstNumber, secondNumber);
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
                    calculatedAnswer = dw.division(firstNumber, secondNumber);
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

