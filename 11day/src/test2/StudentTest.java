package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("Enter student name: ");
            String name = sc.next();
            System.out.println("Enter student age: ");
            int age = sc.nextInt();

            s.setName(name);
            s.setAge(age);

            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + ", " + s.getAge());
        }

    }
}
