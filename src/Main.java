public class Main {

    public static String newRecordManual(){
        Manual carOne = new Manual(
                "Nissan",
                95,
                "Grey",
                "Disel",
                4,
                false,
                true,
                4
        );
        return String.valueOf(carOne);
    }

    public static String newRecordAutomatic(){
        Automatic carA = new Automatic(
                "Mazda",
                19,
                "White",
                "Electric",
                4,
                true,
                true,
                2,
                "DSG"
        );
        return String.valueOf(carA);
    }

    public static String newRecordStandardBike(){
        StandardBike bike = new StandardBike(
                "BMW",
                20,
                "Blue",
                "gas",
                2,
                true,
                false,
                true
        );
        return String.valueOf(bike);
    }

    public static String newRecordSportBike(){
        SportBike bike = new SportBike(
                "Yamaha",
                19,
                "Green",
                "Disel",
                2,
                false,
                false,
                false
        );
        return String.valueOf(bike);
    }

    public static String newRecordFireFighterTruck(){
        FireFighterTruck fireTruck = new FireFighterTruck(
                "KME",
                10,
                "Red",
                "Disel",
                8,
                false,
                true,
                true
        );
        return String.valueOf(fireTruck);
    }

    public static String newRecordRearDump(){
        RearDump dumpTruck = new RearDump(
                "Mack",
                02,
                "Yellow",
                "Disel",
                6,
                false,
                false,
                true
        );
        return String.valueOf(dumpTruck);
    }

    public static void main(String[] args) {
        System.out.println(newRecordManual());
        System.out.println(newRecordAutomatic());
        System.out.println(newRecordStandardBike());
        System.out.println(newRecordSportBike());
        System.out.println(newRecordFireFighterTruck());
        System.out.println(newRecordRearDump());
    }

}
