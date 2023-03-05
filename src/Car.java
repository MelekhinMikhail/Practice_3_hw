public class Car {
    private String brand;
    private String model;
    private String color;
    private int maxSpeed;
    private double engineCapacity;

    public Car(String brand, String model, String color, int maxSpeed, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.engineCapacity = engineCapacity;
    }

    public void drive() {
        System.out.println("Машина " + brand + " " + model + " заведена и готова к эксплуатации.");
    }

    public void park() {
        System.out.println("Машина " + brand + " " + model + " припаркована.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
