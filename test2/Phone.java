package test2;

public class Phone {
    private String brand;
    private int price;

    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //打电话
    public void Call(Phone phone) {
        System.out.println("正在使用价格为" + phone.getPrice() + "的" + phone.getBrand() + "手机打电话");
    }

    //听歌
    public void ListenMusic(Phone phone) {
        System.out.println("正在使用价格为" + phone.getPrice() + "的" + phone.getBrand() + "手机听歌");
    }

}
