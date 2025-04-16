package ExcTest_11day;

import java.util.Scanner;

public class test_11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GirlFriend gf = new GirlFriend();

        while (true) {
            try {
                System.out.println("输入女朋友的名字：");
                String name = sc.nextLine();
                gf.setName(name);
                System.out.println("输入女朋友的年龄");
                String strage = sc.nextLine();
                int age = Integer.valueOf(strage);
                gf.setAge(age);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (NameFormatException e) {
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        System.out.println(gf);

    }
}
