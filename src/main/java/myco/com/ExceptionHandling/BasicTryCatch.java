package myco.com.ExceptionHandling;

import java.util.Random;
public class BasicTryCatch {
    static class HandleError {
        public static int a = 0, b = 0, c = 0, attempts = 0;
        public static Random r = new Random();

        public static int[] results = new int[12];
        static void ErrorHandleRoutine() {
            for (int i = 0; i < results.length; i++) {
                try {
                    b = r.nextInt();
                    c = r.nextInt();
                    a = 12345 / (b / c);
                    results[i]=a;
                } catch (ArithmeticException e) {
                    System.out.println("Exception: " + e);
                    System.out.println("Division by zero.");
                    if (i != 0){
                        --i;
                    }else i = 0;
                    while (c < b){
                        c = r.nextInt();
                    }
                    attempts++;
                }
                System.out.println("b: " + b);
                System.out.println("c: " + c);
                System.out.println("a: " + a);
                System.out.println("Results =  " + results[i]);
                System.out.println();
                System.out.println();
            }
            System.out.println("Number of failed attempts: " + attempts);
        }
    }
    public static void main(String[] args) {

        HandleError.ErrorHandleRoutine();

    }
}