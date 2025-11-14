public class Main {
    public static void main(String[] args) {

        // Create an object from the Car class
        Car car1 = new Car();

        // Set values using setters
        car1.setColor("Silver");
        car1.setModel("Volkswagen");
        car1.setEngine(1.6);
        car1.setDoors(4);

        // Print the values using getters
        System.out.println("Color: " + car1.getColor());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Engine: " + car1.getEngine());
        System.out.println("Number of Doors: " + car1.getDoors());
    }
}
