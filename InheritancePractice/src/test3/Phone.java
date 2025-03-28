package test3;

public class Phone {
    private String brand;
    private double price;
    private static int size = 6;

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
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

    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        Phone.size = size;
    }

    public void call() {
        System.out.println(getBrand() + "手机打电话");
    }

    public void sendMessage() {
        System.out.println(getBrand() + "手机发短信");
    }

    public void playGame() {
        System.out.println(getBrand() + "手机玩游戏");
    }
}
