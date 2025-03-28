package test2;

public class Test2 {
    public static void main(String[] args) {
        Teacher p1 = new Teacher("张三",29,"高中");
        Student p2 = new Student("李四",17,"10班");

        p1.viewCourseSchedule();
        p1.putProblem();

        p2.viewCourseSchedule();
        p2.lecture();

    }
}
