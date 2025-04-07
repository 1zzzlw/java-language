package Test4;

import java.util.ArrayList;

//泛型不具备继承性，但是数据具备继承性
public class test4_7_5 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Er> list3 = new ArrayList<>();

        /*method(list1);
        method(list2); //泛型不具备继承性
        method(list3);
*/
        list1.add(new Ye());
        list1.add(new Fu());
        list1.add(new Er()); //数据具备继承性

        //泛型的通配符 ？
        method2(list1);
        method2(list2);
        method2(list3);

    }

    public static void method(ArrayList<Ye> list) {

    }

    /*
    使用泛型的通配符:
    ?也表示不确定的类型
    他可以进行类型的限定
    ?extendsE:表示可以传递E或者E所有的子类类型?
    super E:表示可以传递E或者E所有的父类类型*/
    public static void method2(ArrayList<? extends Ye> list) {

    }

}




class Ye {

}

class Fu extends Ye {

}

class Er extends Fu {

}