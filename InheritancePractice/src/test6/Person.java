package test6;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void keepPet(Dog dog, String kind) {
        System.out.println("颜色为" + dog.getColor() + "的" + dog.getAge() + "岁的狗正在吃" + kind);
    }

    public void keepPet(Cat cat, String kind) {
        System.out.println("颜色为" + cat.getColor() + "的" + cat.getAge() + "岁的猫正在吃" + kind);
    }

}

