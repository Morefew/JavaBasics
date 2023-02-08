package myco.com.SuperUse;

public class UsingSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight(); // default
        BoxWeight mycube = new BoxWeight(1, 1);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        // This assignments are for testing shipping, Box parameters are needed, otherwise shipping methods will give an error.
        mybox3.weight = 12;
        mybox3.setHeight(7);
        mybox3.setWidth(12);
        mybox3.setDepth(5);

        Shipping myShipping1 = new Shipping(29.6, mybox1);
        Shipping myShipping2 = new Shipping(153, mybox2);
        Shipping myShipping3 = new Shipping(0.5, mybox3);
        Shipping myShipping4 = new Shipping(12, myclone);
        Shipping myShipping5 = new Shipping(1, mycube);

        double shippingCost1 = myShipping1.ShippingGround(myShipping1.shippingBox);
        double shippingCost2 = myShipping2.ShippingGroundExpress(myShipping2.shippingBox);
        double shippingCost3 = myShipping3.ShippingAir(myShipping3.shippingBox);
        double shippingCost4 = myShipping4.ShippingGround(myShipping4.shippingBox);
        double shippingCost5 = myShipping5.ShippingAirExpress(myShipping5.shippingBox);

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol + " m3");
        System.out.println("Weight of mybox1 is " + mybox1.weight + " kg");
        System.out.println("Height = " + mybox1.getHeight() + ", Width = " + mybox1.getWidth() + ", Depth = "+ mybox1.getDepth());
        System.out.println("Travel Distance from center: " + myShipping1.getDistance() +" km");
        System.out.println(mybox1.typeOfConstructorUsed);
        System.out.printf("Shipping cost for shipping order no.%s: $", myShipping1.getShippingOrderNumber());
        System.out.format("%,-8.3f%n", shippingCost1);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol + " m3");
        System.out.println("Weight of mybox2 is " + mybox2.weight + " kg");
        System.out.println("Height = " + mybox2.getHeight() + ", Width = " + mybox2.getWidth() + ", Depth = "+ mybox2.getDepth());
        System.out.println("Travel Distance from center: " + myShipping2.getDistance() +" km");
        System.out.println(mybox2.typeOfConstructorUsed);
        System.out.printf("Shipping cost for shipping order no.%s: $", myShipping2.getShippingOrderNumber());
        System.out.format("%,-8.3f%n", shippingCost2);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol + " m3");
        System.out.println("Weight of mybox3 is " + mybox3.weight + " kg");
        System.out.println("Height = " + mybox3.getHeight() + ", Width = " + mybox3.getWidth() + ", Depth = "+ mybox3.getDepth());
        System.out.println("Travel Distance from center: " + myShipping3.getDistance() +" km");
        System.out.println(mybox3.typeOfConstructorUsed);
        System.out.printf("Shipping cost for shipping order no.%s: $", myShipping3.getShippingOrderNumber());
        System.out.format("%,-8.3f%n", shippingCost3);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol + " m3");
        System.out.println("Weight of myclone is " + myclone.weight + " kg");
        System.out.println("Height = " + myclone.getHeight() + ", Width = " + myclone.getWidth() + ", Depth = "+ myclone.getDepth());
        System.out.println("Travel Distance from center: " + myShipping4.getDistance() +" km");
        System.out.println(myclone.typeOfConstructorUsed);
        System.out.printf("Shipping cost for shipping order no.%s: $", myShipping4.getShippingOrderNumber());
        System.out.format("%,-8.3f%n", shippingCost4);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol + " m3");
        System.out.println("Weight of mycube is " + mycube.weight + " kg");
        System.out.println("Height = " + mycube.getHeight() + ", Width = " + mycube.getWidth() + ", Depth = "+ mycube.getDepth());
        System.out.println("Travel Distance from center: " + myShipping5.getDistance() +" km");
        System.out.println(mycube.typeOfConstructorUsed);
        System.out.printf("Shipping cost for shipping order no.%s: $", myShipping5.getShippingOrderNumber());
        System.out.format("%,-8.3f%n", shippingCost5);
        System.out.println();
    }

}
