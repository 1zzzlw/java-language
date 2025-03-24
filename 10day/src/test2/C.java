package test2;

public class C {
    public static void main(String[] args) {
        String num1 = "123456789";
        String num2 = "12345";

        int n1 = str2int(num1);
        int n2 = str2int(num2);
        System.out.println(n1 + n2);
    }

    //字符串变整数
    public static int str2int(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int n = c - '0';
            num = num * 10 + n;
        }
        return num;
    }

}
