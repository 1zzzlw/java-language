package test4;

import test3.User;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("Xiaomi", 1000);
        Phone p2 = new Phone("Apple", 8000);
        Phone p3 = new Phone("chuizi", 2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> list2 = isInPrice(list, 3000);

        for (int i = 0; i < list2.size(); i++) {
            Phone p = list2.get(i);
            System.out.println(p.getBrand() + " " + p.getPrice());
        }
    }

    //判断手机价格是否在指定区间
    public static ArrayList isInPrice(ArrayList<Phone> list, int price) {

        ArrayList<Phone> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int pPrice = p.getPrice();
            if (pPrice < price) {
                list2.add(p);
            }
        }
        return list2;
    }

}
