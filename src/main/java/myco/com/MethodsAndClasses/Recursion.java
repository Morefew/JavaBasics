package myco.com.MethodsAndClasses;

public class Recursion {
    int [] array;

    Recursion(int length){
        this.array = new int[length];
    }

    void printArray(int arrIndex){
        if (arrIndex == 0) return;
        else printArray(arrIndex-1);
        System.out.println("["+(arrIndex-1)+"] " + array[arrIndex-1]);
        }
    }
class Test{
    public static void main(String[] args) {
        Recursion ob = new Recursion(10);
        int dummyValue;

        for (dummyValue = 0; dummyValue < 10; dummyValue++)
            ob.array[dummyValue] = dummyValue;

        ob.printArray(10);
    }
}