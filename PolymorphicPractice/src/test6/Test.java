package test6;

//在测试类Test中创建B的对象b，并调用成员方法methodB

public class Test {
    public static void main(String[] args) {

        InterB i = new InterB() {
            public void showB() {
                System.out.println("showB");
            }
        };

        B b = new B(i);
        b.methodB();
    }
}

//定义一个接口
interface InterB {
    void showB();
}

//目标：调用成员方法methodB
class B {
    InterB b;
    public B(InterB b){
        this.b = b;
    }

    public void methodB(){
        b.showB();
    }
}
