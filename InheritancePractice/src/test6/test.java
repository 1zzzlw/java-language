package test6;

import test2.Persion;

public class test {
    public static void main(String[] args) {
        Person p1 = new Person("张三",18);
        Dog d1 = new Dog(2,"黑色");
        Cat c1 = new Cat(2,"白色");

        p1.keepPet(d1,"骨头");
        p1.keepPet(c1,"小鱼干");
    }
}
