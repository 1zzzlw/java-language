package test1;

public class Test3 {
    public static void main(String[] args) {
        //这样调用无法直接调用子类特有的方法
        //因为 e1 是 Employee 类型的引用，所以能够调用 Employee 类里定义的 setName、setJob、getName 和 getJob 等方法
        //因为 e1 是 Employee 类型的引用，它指向的是 Employee 类的对象，而非子类对象。
        //所以，不能直接调用子类（如 Lecturer、Tutor 等）特有的方法
        //如果想要调用子类特有的方法，就需要进行向下转型，但前提是该引用实际指向的是子类对象
        // Lecturer realLecturer = (Lecturer) e2

        Employee e1 = new Employee("Alice","1" , "lecturer");

        // 调用getter方法
        System.out.println("ID: " + e1.getId());
        System.out.println("Name: " + e1.getName());
        System.out.println("Job: " + e1.getJob());

        // 调用work方法
        e1.work();

        // 调用setter方法修改属性值
        e1.setJob("manager");
        e1.work();
    }
}
