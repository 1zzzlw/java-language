import java.util.Random;
import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        String result = "";
        int num = r.nextInt(10);

        for (int i = 0; i < 4; i++) {
            boolean isPrime = r.nextBoolean();
            int randomInt;
            if (isPrime) {
                randomInt = r.nextInt(25) + 65;
            }
            else {
                randomInt = r.nextInt(25) + 97;
            }
            char randomChar = (char) randomInt;

            //System.out.print(randomChar + " ");
            result += randomChar;
        }
        //System.out.print(num);
        result += num;
        System.out.println(result);

        System.out.println("请输入验证码:");
        String input = s.nextLine();
        if (result.equals(input)) {
            System.out.println("验证码正确");
        }
        else {
            System.out.println("验证码错误");
        }
    }

}
