package test4;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student("张三","男",17,"中国","高中","001");
        Worker w1 = new Worker("李四","男",27,"中国","公司",4);
        StudentLeader st1 = new StudentLeader("王五","男",18,"中国","高中","002","数学课代表");

        s1.work();
        s1.eat();
        s1.sleep();

        w1.work();
        w1.eat();
        w1.sleep();

        st1.work();
        st1.eat();
        st1.sleep();
    }
}
