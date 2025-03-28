package test4;

interface Inter_2 {
    void show();
}

class Outer_2 {
    // 补齐代码
    public static Inter_2 method() {
        return new Inter_2() {
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}

public class OuterDemo_2 {
    public static void main(String[] args) {
        Outer_2.method().show();
    }
}