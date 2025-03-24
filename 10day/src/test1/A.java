//字符串的遍历
package test1;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        //注意字符串使用lengths时需要加（）
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
        //字符串的反转
        String result = reverse(str);
        System.out.println("反转后的字符串为：" + result);
    }

    //字符串的反转
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            result += ch;
        }
        return result;
    }
}
