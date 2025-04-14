<<<<<<< HEAD
package FunTest_11day;
//引用其他类中的成员方法和引用本类中的成员方法
//引用本类和父类中的成员方法
//引用本类：this::成员方法名 需要注意的是，引用本类方法时，不能在static里面引用，因为static里面不能使用this
//父类方法：super::成员方法名

import java.util.ArrayList;
import java.util.Collections;

public class test_11_5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

        list.stream().filter(new StringOperation()::stringJudge).forEach(System.out::println);

        //由于静态方法中不能引用this，则如果要引用本类中的成员方法需要新建一个本类的对象
        list.stream().filter(new test_11_5()::stringJudge).forEach(System.out::println);

    }

    public boolean stringJudge(String s) {
        return s.startsWith("张") && s.length() == 3;
    }
}
=======
package FunTest_11day;
//引用其他类中的成员方法和引用本类中的成员方法
//引用本类和父类中的成员方法
//引用本类：this::成员方法名 需要注意的是，引用本类方法时，不能在static里面引用，因为static里面不能使用this
//父类方法：super::成员方法名

import java.util.ArrayList;
import java.util.Collections;

public class test_11_5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

        list.stream().filter(new StringOperation()::stringJudge).forEach(System.out::println);

        //由于静态方法中不能引用this，则如果要引用本类中的成员方法需要新建一个本类的对象
        list.stream().filter(new test_11_5()::stringJudge).forEach(System.out::println);

    }

    public boolean stringJudge(String s) {
        return s.startsWith("张") && s.length() == 3;
    }
}
>>>>>>> 2e74c34785f47e2f5b4c6e0aa44998d4d61f8ef2
