public class Bicycle extends Vehicle{
    private String modelName;
    private int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
       super(modelName,wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}


