public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle("Велосипед 1", 2);
        Bicycle bicycle2 = new Bicycle("Велосипед 2", 2);

        Car car = new Car("Машина 1", 4);
        Car car2 = new Car("Машина 2", 4);

        Truck truck = new Truck("Грузовик 1", 6);
        Truck truck2 = new Truck("Грузовик 2", 8);

        ServiceStation station = new ServiceStation();

        station.check(bicycle);
        System.out.println("\n");

        station.check(bicycle2);
        System.out.println("\n");

        station.check(car);
        System.out.println("\n");

        station.check(car2);
        System.out.println("\n");

        station.check(truck);
        System.out.println("\n");

        station.check(truck2);
    }
}

