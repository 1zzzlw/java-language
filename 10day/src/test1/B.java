package test1;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个金额：");
        int money = sc.nextInt();
        String moneyStr;
        while (true) {
            if (money < 0 || money > 9999999) {
                System.out.println("金额无效,请重新输入:");
            } else {
                moneyStr = getMoney(money);
                System.out.println(moneyStr);
                break;
            }
        }

        int count = 0;
        String result = "";
        String[] arr = {"佰" , "拾" , "万" , "仟" , "佰" , "拾" , "元"};
        count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        for (int i = 0; i < moneyStr.length(); i++) {
            char ch = moneyStr.charAt(i);
            result += ch + arr[i];
        }
        System.out.println(result);
    }

    public static String getMoney(int money) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String result = "";
        while (money > 0) {
            int ge = money % 10;
            money = money / 10;
            result = arr[ge] + result;
        }
        return result;
    }

}
