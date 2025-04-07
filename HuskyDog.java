package Test4;

public class HuskyDog extends Dog {
    public HuskyDog() {
    }

    public HuskyDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一直叫做" + getName() + "的，" + getAge() + "的哈士奇，正在吃骨头，边吃边拆家");
    }
}
