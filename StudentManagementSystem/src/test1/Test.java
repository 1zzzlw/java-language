package test1;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = generateVerificationCode();
        System.out.println(str);
    }

    public static String generateVerificationCode() {
        Random r = new Random();
        char[] arr = new char[5];
        boolean[] bool = new boolean[arr.length];
        for (int i = 0; i < 4; i++) {
            boolean isPrime = r.nextBoolean();
            int randomInt;
            if (isPrime) {
                randomInt = r.nextInt(26) + 65;
            } else {
                randomInt = r.nextInt(26) + 97;
            }
            char randomChar = (char) randomInt;
            int index;
            do {
                index = r.nextInt(5);
            } while (bool[index]);

            bool[index] = true;
            arr[index] = randomChar;

        }

        int num = r.nextInt(10);
        char charNum = (char) (num + '0');
        int index;
        do {
            index = r.nextInt(5);
        } while (bool[index]);
        arr[index] = charNum;
        String str = new String(arr);
        return str;
    }
}
