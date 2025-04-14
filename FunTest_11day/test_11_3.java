<<<<<<< HEAD
package FunTest_11day;
/*
创建集合添加学生对象，学生对象属性:name，age
把姓名和年龄拼接成:张三-23的字符串，并放到数组当中(使用方法引用完成)
*/
//String[]::new 引用数组的成员方法
import java.util.ArrayList;
import java.util.Arrays;

public class test_11_3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        list.add(new Student("wnagwu",25));

        String[] arr = list.stream().map(test_11_3::beString).toArray(String[]::new);

        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static String beString(Student s) {
        return s.getName() + "-" + s.getAge();
    }

}
=======
package FunTest_11day;
/*
创建集合添加学生对象，学生对象属性:name，age
把姓名和年龄拼接成:张三-23的字符串，并放到数组当中(使用方法引用完成)
*/
//String[]::new 引用数组的成员方法
import java.util.ArrayList;
import java.util.Arrays;

public class test_11_3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        list.add(new Student("wnagwu",25));

        String[] arr = list.stream().map(test_11_3::beString).toArray(String[]::new);

        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static String beString(Student s) {
        return s.getName() + "-" + s.getAge();
    }

}
>>>>>>> 2e74c34785f47e2f5b4c6e0aa44998d4d61f8ef2
