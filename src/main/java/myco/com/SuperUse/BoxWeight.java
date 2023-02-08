package myco.com.SuperUse;

public class BoxWeight extends Box{
    double weight; // weight of box

    String typeOfConstructorUsed;

    // construct clone of an object
    BoxWeight(BoxWeight ob) { // pass object to constructor
        super(ob);
        weight = ob.weight;
        typeOfConstructorUsed = "Super Clone";

    }
    // constructor when all parameters are specified
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // call superclass constructor
        weight = m;
        typeOfConstructorUsed = "Super All Parms";

    }
    // default constructor
    BoxWeight() {
        super();
        weight = -1;
        typeOfConstructorUsed = "Super No Parms";
    }
    // constructor used when cube is created
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
        typeOfConstructorUsed = "Super Length";
    }

}
