public class StandardBike extends Bike{

    protected boolean windscreens;

    public StandardBike(String brand, int model, String color, String fuel, int wheels, boolean automatic, boolean electricStart, boolean windscreens) {
        super(brand, model, color, fuel, wheels, automatic, electricStart);
        this.windscreens = windscreens;
    }

    @Override
    public String toString() {
        return "StandardBike{" +
                "windscreens=" + windscreens +
                ", electricStart=" + electricStart +
                ", brand='" + brand + '\'' +
                ", model=" + model +
                ", color='" + color + '\'' +
                ", fuel='" + fuel + '\'' +
                ", wheels=" + wheels +
                ", automatic=" + automatic +
                '}';
    }
}
