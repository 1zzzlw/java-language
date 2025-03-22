package test5;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        // 创建一个学生对象数组
        Student[] arr = new Student[5];
        // 创建学生对象
        Student s1 = new Student("1", "张三", 23);
        Student s2 = new Student("2", "李四", 24);
        Student s3 = new Student("3", "王五", 23);
        // 将学生对象添加到数组中
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        //添加一个新的学生对象
        Student s4 = AddStudent();

        //判断数组中是否有该学生对象
        boolean flag = contains(arr, s4.getId());
        if (flag) {
            System.out.println("数组中已经有该学生对象");
        } else {
            //添加学生对象，判断是否需要扩容数组
            int count = CountNum(arr);
            if (count == arr.length) {
                //需要扩容
                Student[] newArr = NewArr(arr);
                //新数组中添加学生对象
                newArr[count] = s4;
                printArr(newArr);
            } else {
                //不需要扩容
                arr[count] = s4;
                printArr(arr);
            }

            //删除学生对象
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入要删除的学生的id:");
            String id = sc.next();
            int index = getIndex(arr, id);
            if (index > 0) {
                    arr[index] = null;
                    printArr(arr);
            } else {
                System.out.println("数组中没有该学生对象,无法删除");
            }

            //修改学生对象使其年龄加1
            System.out.print("请输入要修改的学生的id:");
            String id1 = sc.next();
            int index1 = getIndex(arr, id1);
            if (index1 > 0) {
                Student stu = arr[index1];
                int newAge = stu.getAge() + 1;
                stu.setAge(newAge);
                printArr(arr);
            }
        }
    }

    //获取学生id索引
    public static int getIndex(Student[] arr, String id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                if (stu.getId().equals(id)) {
                    return i;
                }
            }
        }
        return -1;
    }


    //添加学生对象
    public static Student AddStudent() {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.print("请输入学生的id:");
        s.setId(sc.next());
        System.out.print("请输入学生的姓名:");
        s.setName(sc.next());
        System.out.print("请输入学生的年龄:");
        s.setAge(sc.nextInt());
        return s;
    }

    //打印数组
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            if (s != null) {
                System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
            }
        }
    }

    //创建新数组扩容，并复制老数组的数据
    public static Student[] NewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }


    //判断数组中被占用的空间个数
    public static int CountNum(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //判断数组中是否有该学生对象
    public static boolean contains(Student[] arr, String id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                if (stu.getId().equals(id)) {
                    return true;
                }
            }
        }
        return false;
    }


}
