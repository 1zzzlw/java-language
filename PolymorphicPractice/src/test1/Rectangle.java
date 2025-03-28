package test1;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle() {
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    void getArea() {
        System.out.println("长方形的面积为" + a * b);
    }

    @Override
    void getPerimeter() {
        System.out.println("长方形的周长为" + 2 * (a + b));
    }
}
