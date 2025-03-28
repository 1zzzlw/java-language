package test1;

public class Test1 {
    public static void main(String[] args) {
        Lecturer l1 = new Lecturer("Alice", "001");
        Tutor t1 = new Tutor("Bob", "002");
        Maintainer m1 = new Maintainer("John", "003");
        Buyer b1 = new Buyer("Bob", "004");

        l1.work();
        t1.work();
        m1.work();
        b1.work();

    }
}
