import java.util.Random;
import java.util.Scanner;

public class Test24 {
    public static void main(String[] args) {
        //生成中奖球号
        int[] arr = CreatNumber();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //用户输入中奖球号
        int[] userArr = UserInput();

        for (int i = 0; i < userArr.length; i++) {
            System.out.print(userArr[i] + " ");
        }

        int redNumber = 0;
        int blueNumber = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (arr[i] == userArr[j]) {
                    redNumber++;
                    break;
                }
            }
        }

        if (arr[6] == userArr[6]) {
            blueNumber++;
        }

        if (redNumber == 6 && blueNumber == 1) {
            System.out.println("中奖10000万");
        }
        if (redNumber == 6 && blueNumber == 0) {
            System.out.println("中奖500万");
        }
        if (redNumber == 5 && blueNumber == 1) {
            System.out.println("中奖3000元");
        }
        if ((redNumber == 5 && blueNumber == 0) || (redNumber == 4 && blueNumber == 1) ) {
            System.out.println("中奖200元");
        }
        if ((redNumber == 4 && blueNumber == 0) || (redNumber == 3 && blueNumber == 1) ) {
            System.out.println("中奖10元");
        }
        if ((redNumber == 2 && blueNumber == 1) || (redNumber == 1 && blueNumber == 1) || (redNumber == 0 && blueNumber == 1)) {
            System.out.println("中奖5元");
        }
    }

    //输入用户的号码
    public static int[] UserInput() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < arr.length - 1; ) {
            System.out.println("请输入第" + (i + 1) + "个红球的球号");
            int n = sc.nextInt();
            if (n < 1 || n > 33) {
                System.out.println("输入不合法，请重新输入");
            }
            else {
                boolean flag = Judge(arr, n);
                if (!flag) {
                    arr[i] = n;
                    i++;
                }
                else {
                    System.out.println("输入的数字重复，请重新输入");
                }
            }
        }

        System.out.println("现在请输入蓝色中奖号码");
        while (true) {
            int n1 = sc.nextInt();
            if (n1 < 1 || n1 > 16) {
                System.out.println("输入不合法，请重新输入");
            }
            else {
                arr[arr.length - 1] = n1;
                break;
            }
        }
        return arr;
    }

    //随机生成中奖号码
    public static int[] CreatNumber() {
        int[] arr = new int[7];
        Random r = new Random();

        //随机设置红色中奖球号
        for (int i = 0; i < arr.length - 1; ) {
            int n1 = r.nextInt(33) + 1;
            boolean flag = Judge(arr, n1);
            if (!flag) {
                arr[i] = n1;
                i++;
            }
        }

        //随机设置蓝色中奖球号
        int n2 = r.nextInt(16) + 1;
        arr[arr.length - 1] = n2;

        return arr;
    }

    //防止红色中奖球号中出现相同的数字
    public static boolean Judge(int[] arr, int num) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

}
