package test4;

interface Inter {
    void show();
}

class Inner implements Inter {
    @Override
    public void show() {
        System.out.println("HelloWorld");
    }
}

class Outer {
    public static Inter method() {
        return new Inner();
    }
    //补齐代码
}
public class OuterDemo {
    public static void main(String[] args) {
        Outer.method().show();
    }
}
