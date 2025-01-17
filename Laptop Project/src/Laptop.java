
public class Laptop {
    private int id;
    private String brand;
    private String model;
    private double price;

    // Constructor
    public Laptop(int id, String brand, String model, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method to display laptop details
    @Override
    public String toString() {
        return "Laptop [ID=" + id + ", Brand=" + brand + ", Model=" + model + ", Price=" + price + "]";
    }
}