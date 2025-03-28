package test5;

//在测试类Test中创建A的对象a并调用成员方法methodA(),要求用两种方式实现

//方式一：匿名内部类
/*public class Test {
    public static void main(String[] args) {

        InterA i = new InterA() {
            @Override
            public void showA() {
                System.out.println("showA");
            }
        };

        A a = new A();
        a.methodA(i);
    }
}

//定义接口
interface InterA {
    void showA();
}

class A {
    public void methodA(InterA a) {
        a.showA();
    }
}*/

//方法二：局部内部类
/*
public class Test {
    public static void main(String[] args) {
        A a = new A();
        // 局部内部类开始
        class LocalInterAImpl implements InterA {
            @Override
            public void showA() {
                System.out.println("Using local inner class to implement showA method");
            }
        }
        // 创建局部内部类的实例
        InterA localInterA = new LocalInterAImpl();
        a.methodA(localInterA);
    }
}

//定义接口
interface InterA {
    void showA();
}

class A {
    public void methodA(InterA a) {
        a.showA();
    }
}*/

//方法三：创建一个实现类
public class Test {
    public static void main(String[] args) {
        A a = new A();
        // 创建InterA接口的实现类的实例
        InterAImpl interA = new InterAImpl();
        a.methodA(interA);
    }
}

//定义接口
interface InterA {
    void showA();
}

class A {
    public void methodA(InterA a) {
        a.showA();
    }
}

// 创建实现InterA接口的类
class InterAImpl implements InterA {
    @Override
    public void showA() {
        System.out.println("Using an implementation class to implement showA method");
    }
}
//和局部类差不多，就是把实现InterA接口的类写在了外面