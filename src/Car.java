public class Car {

    // Fields (Properties)
    private String color;
    private String model;
    private double engine;
    private int doors;

    // Getter & Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter & Setter for doors
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    // Getter & Setter for engine
    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    // Getter & Setter for color
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
