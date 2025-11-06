// Main class for main() method
class Main {
    public static void main(String[] args) {
        // Create object from Car class
        Car myCar = new Car();
        
        // Use setter to set brand and speed
        myCar.setBrand("Toyota");
        myCar.setSpeed(120);
        
        // Call displayInfo()
        myCar.displayInfo();
        
        // Test: try to set negative speed (should show error)
        System.out.println("\nTesting with negative speed:");
        myCar.setSpeed(-50);
        myCar.displayInfo(); // speed should still be 120
    }
}

// Car class to store car data and behaviors
class Car {
    // Private properties
    private String brand;
    private int speed;
    
    // Getter for brand
    public String getBrand() {
        return brand;
    }
    
    // Setter for brand
    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }
    
    // Getter for speed
    public int getSpeed() {
        return speed;
    }
    
    // Setter for speed
    public void setSpeed(int newSpeed) {
        if (newSpeed < 0) {
            System.out.println("Error: Speed cannot be less than 0!");
        } else {
            this.speed = newSpeed;
        }
    }
    
    // Method to display car information
    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed + " km/h");
    }
}
