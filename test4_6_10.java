package Test3;

public class test4_6_10 {
    public static void main(String[] args) {

        int sum = Fun(1);
        System.out.println(sum);
    }

    public static int Fun(int num) {
        if (num <= 0 || num >= 11) {
            return -1;
        }

        if (num == 10) {
            return 1;
        }

        return (Fun(num + 1) + 1) * 2;
    }
}

