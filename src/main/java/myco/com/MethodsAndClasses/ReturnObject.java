package myco.com.MethodsAndClasses;

public class ReturnObject {

    int a;

    ReturnObject(int i){
        a = i;
    }

    /* ReturnObject method returns an object of type ReturnObject */
    ReturnObject incrByTen(){
        return new ReturnObject(a+10);
    }
}

class RetObj{
    public static void main(String[] args) {
        ReturnObject ob1 = new ReturnObject(2);
        ReturnObject ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: "+ ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: "+ ob2.a);
    }
}
