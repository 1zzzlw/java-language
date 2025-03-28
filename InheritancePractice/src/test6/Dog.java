package test6;

public class Dog extends Animal {
    public Dog() {

    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public void eat(String kind) {
        System.out.println("颜色为" + getColor() + "的" + getAge() + "岁的狗正在吃" + kind);
    }

    public void lookHoeme() {
        System.out.println("狗正在看家");
    }
}
