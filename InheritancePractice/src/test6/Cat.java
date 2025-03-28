package test6;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public void eat(String kind) {
        System.out.println("颜色为" + getColor() + "的" + getAge() + "岁的猫正在吃" + kind);
    }

    public void catchMouse() {
        System.out.println("猫正在捉老鼠");
    }
}
