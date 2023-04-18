public class ServiceStation {
    public void check(WheeledVehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }

    public void check(MotorVehicle vehicle) {
        check((WheeledVehicle) vehicle);
        vehicle.checkEngine();
        if (vehicle instanceof Truck) {
            ((Truck) vehicle).checkTrailer();
        }
    }
}
