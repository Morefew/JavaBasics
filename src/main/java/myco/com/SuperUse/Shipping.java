package myco.com.SuperUse;

import java.util.random.RandomGenerator;

/* Let's compose a shipping using
*  the classes BOX and BOXWEIGHT to assemble a shipment
*
*/

public class Shipping {

    private final int shippingOrderNumber;
    private final double distance;
    private double groundCost = 1.25;
    private double groundExpressCost = 3.00;
    private double airCost = 1.75;
    private double airExpressCost = 5.75;
    private double weight;

    private double dimentions;

    BoxWeight shippingBox;

    public double getDistance(){
        return distance;
    }
    public double getShippingOrderNumber() {
        return shippingOrderNumber;
    }

    public Shipping(double distance, BoxWeight boxWeight) {
        this.distance = distance;
        shippingBox = boxWeight;
        this.shippingOrderNumber = RandomGenerator.getDefault().nextInt(100,999);
        this.dimentions = boxWeight.volume();
        this.weight = boxWeight.weight;
    }

    public double ShippingGround(BoxWeight shippingBox) {
        return this.distance * (groundCost * (0.01 * shippingBox.weight) * (0.01 * shippingBox.volume()));
    }

    public double ShippingGroundExpress( BoxWeight shippingBox) {
        return this.distance * (groundExpressCost * (0.01 * shippingBox.weight) * (0.01 * shippingBox.volume()));
    }

    public double ShippingAir(BoxWeight shippingBox){
        return this.distance * (airCost * (0.01 * shippingBox.weight) * (0.01 * shippingBox.volume()));
    }

    public double ShippingAirExpress(BoxWeight shippingBox){
        return this.distance * (airExpressCost * (0.01 * shippingBox.weight) * (0.01 * shippingBox.volume()));
    }
}
