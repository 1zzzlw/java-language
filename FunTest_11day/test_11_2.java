<<<<<<< HEAD
package FunTest_11day;
/*
需求:
创建集合添加学生对象
学生对象属性:name，age
要求:
获取姓名并放到数组当中
使用方法引用完成
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class test_11_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        list.add(new Student("wnagwu",25));

/*        String[] arr = list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        }).toArray(String[]::new);*/

        String[] arr = list.stream().map(Student::getName).toArray(String[]::new);

        System.out.println(Arrays.toString(arr));
    }
}
=======
package FunTest_11day;
/*
需求:
创建集合添加学生对象
学生对象属性:name，age
要求:
获取姓名并放到数组当中
使用方法引用完成
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class test_11_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        list.add(new Student("wnagwu",25));

/*        String[] arr = list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        }).toArray(String[]::new);*/

        String[] arr = list.stream().map(Student::getName).toArray(String[]::new);

        System.out.println(Arrays.toString(arr));
    }
}
>>>>>>> 2e74c34785f47e2f5b4c6e0aa44998d4d61f8ef2
