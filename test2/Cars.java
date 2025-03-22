package test2;

public class Cars {
    private String brand;
    private double price;
    private String color;

    public Cars() {

    }

    public Cars(double price, String brand, String color) {
        this.price = price;
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
