package Test4;
//hashCode 哈希值

public class test4_7_8 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("zhangsan",28);
        Student1 s2 = new Student1("zhangsan",28);

        //如果没有重写hashCode方法，不同对象计算的结果值是不同的,重写之后的哈希值才相同
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("abc".hashCode()); //96354
        System.out.println("acD".hashCode()); //96354 哈希值有可能相同
    }
}
