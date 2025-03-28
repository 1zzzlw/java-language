package test1;

public class Test2 {
    public static void main(String[] args) {
        Employee lecturer = new Lecturer("Alice", "1");
        Employee tutor = new Tutor("Bob", "2");
        Employee maintainer = new Maintainer("Charlie","3");
        Employee buyer = new Buyer("David","4");

        // 调用子类重写的方法
        lecturer.work();
        tutor.work();
        maintainer.work();
        buyer.work();

        // 向下转型示例
        if (lecturer instanceof Lecturer) {
            Lecturer realLecturer = (Lecturer) lecturer;
            // 可以在这里调用 Lecturer 类特有的方法（如果有的话）
            realLecturer.work();
        }
    }
}