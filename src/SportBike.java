public class SportBike extends Bike{

    protected boolean isASnowBike;

    public SportBike(String brand, int model, String color, String fuel, int wheels, boolean automatic, boolean electricStart, boolean isASnowBike) {
        super(brand, model, color, fuel, wheels, automatic, electricStart);
        this.isASnowBike = isASnowBike;
    }

    @Override
    public String toString() {
        return "SportBike{" +
                "isASnowBike=" + isASnowBike +
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
