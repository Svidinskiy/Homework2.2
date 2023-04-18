public abstract class WheeledVehicle extends Vehicle {
    public WheeledVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void service() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
