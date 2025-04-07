package Test4;

public class TaddyDog extends Dog{
    public TaddyDog() {
    }

    public TaddyDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一直叫做" + getName() + "的，" + getAge() + "的泰迪，正在吃骨头，边吃边蹭");

    }
}
