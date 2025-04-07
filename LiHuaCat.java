package Test4;

public class LiHuaCat extends Cat {
    public LiHuaCat() {
    }

    public LiHuaCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一直叫做" + getName() + "的，" + getAge() + "的狸花猫，正在吃鱼");
    }


}
