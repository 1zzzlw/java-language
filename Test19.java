public class Test19 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 101; i <= 200; i++) {
            int a = Judge(i);
            if (a > 0) {
                count ++;
                System.out.print(a + " ");
            }
        }
        System.out.println("一共有" + count + "个素数");
    }

    public static int Judge(int n) {

        int count = 0;
        for (int k = 1; k < n / 2; k++) {
            if (n % k == 0) {
                count++;
            }
        }
        if (count == 1) {
            return n;
        } else {
            return 0;
        }
    }
}
