package test1;

public class B {
    public static void main(String[] args) {
        //链式编程
        //当我们在调用一个方法的时候，不需要用变量接收他的结果，可以继续调用其他方法
        int len = getString().substring(1).replace("A","Q").length();
        System.out.println(len);

    }

    public static String getString(){
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append("world");
        return sb.toString();
    }

}
