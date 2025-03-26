package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {

    //如果不在方法内部定义ArrayList集合，可以在外面定义一个静态的ArrayList集合，否则方法结束后，集合就会被释放
    //private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        loop:
        while (true) {

            showMenu();
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();

            //这种switch语句的写法是jdk12的新特性，可以省略break并且不会执行case后面的语句
            switch (choice) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> showStudent(list);
                case "5" -> {
                    System.out.println("退出成功");
                    break loop;
                }
                default -> System.out.println("输入错误，请重新输入");
            }
        }

    }

    //显示菜单
    public static void showMenu() {
        System.out.println("----------学生管理系统----------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查看学生");
        System.out.println("5.退出");
        System.out.println("请输入你的选择：");
    }

    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("请输入学生的id：");
        String id = sc.next();
        boolean flag = contains(list, id);
        if (flag) {
            System.out.println("id已经存在，请重新输入");
        } else {
            s.setId(id);
            System.out.println("请输入学生的姓名：");
            String name = sc.next();
            s.setName(name);
            System.out.println("请输入学生的年龄：");
            int age = sc.nextInt();
            s.setAge(age);
            System.out.println("请输入学生的地址：");
            String address = sc.next();
            s.setAddress(address);
            list.add(s);
        }
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {

        System.out.println("输入要删除学生的id：");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            boolean flag = contains(list, id);
            if (flag) {
                list.remove(i);
                System.out.println("删除成功");
                break;
            } else {
                System.out.println("id不存在");
                break;
            }
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("输入要修改学生的id：");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            s.setId(id);
            System.out.println("请输入要修改的学生的姓名：");
            String name = sc.next();
            s.setName(name);
            System.out.println("请输入要修改的学生的年龄：");
            int age = sc.nextInt();
            s.setAge(age);
            System.out.println("请输入要修改的学生的地址：");
            String address = sc.next();
            s.setAddress(address);
            list.add(index, s);
            System.out.println("修改成功");
        } else {
            System.out.println("id不存在");
        }
    }

    //查看学生
    public static void showStudent(ArrayList<Student> list) {

        if (list.size() == 0) {
            System.out.println("无学生信息，请先添加学生信息");
            return;
        } else {
            for (int i = 0; i < list.size(); i++) {

                System.out.println("id" + "\t\t" + "姓名" + "\t" + "年龄" + "\t" + "地址");
                Student s = list.get(i);
                System.out.println(s.getId() + "\t\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
            }
        }
    }

    //查看学生id在数组中是否已经存在
    public static boolean contains(ArrayList<Student> list, String id) {

   /*     for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            String sid = s.getId();
            if (sid.equals(id)) {
                return true;
            }
        }
        return false;*/
        return getIndex(list, id) >= 0;
    }

    //找出学生id在数组中所在的位置即索引
    public static int getIndex(ArrayList<Student> list, String id) {

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            String sid = s.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }


}

