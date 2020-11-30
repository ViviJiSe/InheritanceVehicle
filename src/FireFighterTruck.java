public class FireFighterTruck extends Truck {

    protected boolean isAHeavyRescueVehicle;

    public FireFighterTruck(String brand, int model, String color, String fuel, int wheels, boolean automatic, boolean emergencyTruck, boolean isAHeavyRescueVehicle) {
        super(brand, model, color, fuel, wheels, automatic, emergencyTruck);
        this.isAHeavyRescueVehicle = isAHeavyRescueVehicle;
    }

    @Override
    public String toString() {
        return "FireFighterTruck{" +
                "isAHeavyRescueVehicle=" + isAHeavyRescueVehicle +
                ", emergencyTruck=" + emergencyTruck +
                ", brand='" + brand + '\'' +
                ", model=" + model +
                ", color='" + color + '\'' +
                ", fuel='" + fuel + '\'' +
                ", wheels=" + wheels +
                ", automatic=" + automatic +
                '}';
    }
}
