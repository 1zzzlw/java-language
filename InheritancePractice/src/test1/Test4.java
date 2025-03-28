package test1;

public class Test4 {
    public static void main(String[] args) {
        //向上转型
        //无法直接调用子类特有的方法
        //若 Teacher 类有自己特有的方法，而这些方法在 Employee 类中并未定义，那么不能直接通过 e1 引用调用这些方法。
        //若要调用，需要进行向下转型
        Employee e1 = new Teacher();
        // 调用 Employee 类中定义的方法
        //因为 e1 是 Employee 类型的引用，所以能够调用 Employee 类里定义的 setName、setJob、getName 和 getJob 等方法
        e1.setName("John");
        e1.setJob("Math Teacher");
        System.out.println("Name: " + e1.getName());
        System.out.println("Job: " + e1.getJob());

        // 调用被重写的 work 方法
        //要是子类 Teacher 重写了父类 Employee 的方法（例如 work 方法），当通过父类引用 e1 调用该方法时，实际执行的是子类重写后的方法
        //如果没有重写，则调用父类中的work方法
        e1.work();
    }
}
