package test2;

public class Test1 {
    public static void main(String[] args) {
        Persion p1 = new Teacher("张三",29,"高中");
        Persion p2 = new Student("李四",17,"10班");

        p1.viewCourseSchedule();
        ((Teacher)p1).putProblem();

        p2.viewCourseSchedule();
        ((Student)p2).lecture();

    }
}
