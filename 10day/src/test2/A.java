//转换罗马数字
package test2;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag;
        String str;
        do {
            System.out.println("请输入一个0~9的字符串:");
            str = sc.next();
            flag = isRoman(str);
        } while (!flag);

        String[] arr = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int num = ch - '0';
                for (int j = 0; j < arr.length; j++) {
                    if (num == j) {
                        System.out.print(arr[j] + " ");
                    }

            }
        }
    }

    //判断是否是罗马数字
    public static boolean isRoman(String str) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                System.out.println("输入错误，请重新输入");
                return false;
            }
        }
        return true;
    }
}
