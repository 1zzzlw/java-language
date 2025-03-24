package test3;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class UserTest {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("001", "zhangsan", 123456);
        User u2 = new User("002", "lisi", 987654321);
        User u3 = new User("003", "wangwu", 9865431);

        list.add(u1);
        list.add(u2);
        list.add(u3);

        boolean flag = contains(list, "001");
        System.out.println(flag);

    }

    public static boolean contains(AbstractList<User> list, String id) {

        for (int i = 0; i < id.length(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)) {
                return true;
            }
        }
        return false;
    }

}
