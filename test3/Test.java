package test3;

public class Test {
    public static void main(String[] args) {
        Book book = new Book("司马光", "《资治通鉴》");
        Student student = new Student("张三", 18);

        student.read(book);
    }
}
