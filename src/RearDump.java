public class RearDump extends Truck{

    protected boolean isAnArticulatedDumpTruck;

    public RearDump(String brand, int model, String color, String fuel, int wheels, boolean automatic, boolean emergencyTruck, boolean isAnArticulatedDumpTruck) {
        super(brand, model, color, fuel, wheels, automatic, emergencyTruck);
        this.isAnArticulatedDumpTruck = isAnArticulatedDumpTruck;
    }

    @Override
    public String toString() {
        return "RearDump{" +
                "isAnArticulatedDumpTruck=" + isAnArticulatedDumpTruck +
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
