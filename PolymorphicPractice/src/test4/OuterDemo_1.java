package test4;

interface Inter_1 {
    void show();
}

class Outer_1 {
    public static Inter_1 method() {
        // 局部内部类
        class Inner_1 implements Inter_1 {
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        }
        return new Inner_1();
    }
}

public class OuterDemo_1 {
    public static void main(String[] args) {
        Outer_1.method().show();
    }
}