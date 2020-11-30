public class Vehicle {

    protected String brand;
    protected int model;
    protected String color;
    protected String fuel;
    protected int wheels;
    protected boolean automatic;

    protected void getCountOfWheels(){

    }
    protected void turnLeft(){

    }

    protected void turnRight(){

    }

    protected void accelerate(){

    }

    protected void breaks(){

    }

    public Vehicle(String brand, int model, String color, String fuel, int wheels, boolean automatic) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.fuel = fuel;
        this.wheels = wheels;
        this.automatic = automatic;
    }

    public String getBrand() {
        return brand;
    }

    public int getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
