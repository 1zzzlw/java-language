package test1;

public class Round extends Shape {
    private double r;
    private static double PI = 3.14;

    public Round() {
    }

    public Round(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        Round.PI = PI;
    }

    @Override
    void getArea() {
        System.out.println("圆的面积为" + PI * r * r);
    }

    @Override
    void getPerimeter() {
        System.out.println("圆的周长为" + 2 * PI * r);
    }
}
