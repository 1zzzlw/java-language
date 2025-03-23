package test1;

public class A {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");

        //添加元素append
        sb.append("hello");
        sb.append("world");
        sb.append("java");
        sb.append(1);

        //反转reverse
        sb.reverse();

        //获取长度length()
        int len = sb.length();
        System.out.println(len);

        //toString
        //append拼接的字符串不是String类型的，而是StringBuilder类型的
        //所以需要把StringBuilder类型转换为String类型
        String s = sb.toString();
        System.out.println(s);

        //由于StringBuilder时java已经写好的类
        //所以不需要new，会自动分配空间
        //打印的对象不是地址值而是属性值
        System.out.println(sb);


    }
}
