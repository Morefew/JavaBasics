package myco.com.MethodsAndClasses;

public class OverloadDemo {
    void test(){
        System.out.println("No Params");
    }

    void test(int a){
        System.out.println("print parameter a: "+ a);
    }

    void test(int a, int b){
        System.out.println("print parameter  a and b: " + a + " " + b);
    }

    double test(double a){
        System.out.println("print parameter double a: " + a);
        return a*a;
    }
}

class Overload{
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double resultFirst;
        double resultSecond;


        ob.test();
        ob.test(10);
        ob.test(10,20);
        ob.test(3.24657);
        resultFirst = ob.test(123.25);
        resultSecond = ob.test(3.24657);
        System.out.println("Result of ob.test(123.25): "+ resultFirst);
        System.out.println("Result of ob.test(3.24657): "+ resultSecond);
    }
}
