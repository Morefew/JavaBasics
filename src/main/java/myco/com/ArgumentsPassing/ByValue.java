package myco.com.ArgumentsPassing;

// Primitive types are passed by value.
public class ByValue {
    void meth(int i, int j) {
        int a = 0;
        int b = 0;
        System.out.println("a = "+a+" b = "+b+" i = "+i+" j = "+j);
        i *= 2;
        j /= 2;
        System.out.println( "i = " + i +" ; j = " + j);
    }
}
class CallByValue {

    /* When you pass a primitive type to a method, it is passed by value.
       This value is read, then assigned to the formal parameter, this is
       the parameter inside the method definition. This method will have
       no effect over the primitives pass as argument.

       The call tells the method to assume the values as parameters.
    */
    
    public static void main(String[] args) {
        ByValue ob = new ByValue();
        int a = 15, b = 20;
        System.out.println("/............................................../");
        System.out.println("a and b before call: " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a and b after call: " + a + " " + b);
        System.out.println("/............................................../");
    }
}
