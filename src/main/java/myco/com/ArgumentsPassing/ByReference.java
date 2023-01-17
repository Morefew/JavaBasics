package myco.com.ArgumentsPassing;

// Objects passed through their references.
public class ByReference {

    int a, b;

    public ByReference(int i, int j){
     a = i;
     b = j;
    }

    //pass and object
    void objectCall(ByReference byReference) {
        byReference.a *= 2;
        byReference.b /= 2;
//        System.out.println( "i = " + i +" ; j = " + j);
    }
}
class CallByReference {

    /* When you pass an object to a method, it is passed by reference.
       Thus, when you this reference will be process by the operation(s) that occur inside the method.
       This method will have an effect over the value of the attributes passed as argument.

       The call tells the method to perform it operations over the attributes of the object.

    */
    
    public static void main(String[] args) {
        ByReference ob = new ByReference(15,20);
        System.out.println("/............................................../");
        System.out.println("a and b before call: " + ob.a + " " + ob.b);
        ob.objectCall(ob);
        System.out.println("a and b after call: " + ob.a + " " + ob.b);
        System.out.println("/............................................../");
    }
}
