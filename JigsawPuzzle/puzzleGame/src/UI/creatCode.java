package UI;

import java.util.Random;

public class creatCode {
    public static String getCode() {
        Random r = new Random();
        char[] arr = new char[5];
        boolean[] bool = new boolean[arr.length];
        for (int i = 0; i < 4; i++) {
            //随机生成true false 两种结果
            boolean isPrime = r.nextBoolean();
            int randomInt;
            //随机生成大小写字母对应的ASCLL码
            if (isPrime) {
                randomInt = r.nextInt(26) + 65;
            } else {
                randomInt = r.nextInt(26) + 97;
            }
            //将大小写转换成字符
            char randomChar = (char) randomInt;
            int index;
            //随机生成索引，并且如果该数组索引有字符，则为true继续循环，否则为false重新随机生成索引
            do {
                index = r.nextInt(5);
            } while (bool[index]);
            //将随机生成的索引赋值true代表这个索引位置已经有值了，下次数组赋值不可以用此索引了
            bool[index] = true;
            arr[index] = randomChar;
        }
        //接下来重复上面的找随机索引的循环将唯一一个没有被赋值的索引找到并赋值一个数字字符
        int num = r.nextInt(10);
        char charNum = (char) (num + '0');
        int index;
        do {
            index = r.nextInt(5);
        } while (bool[index]);
        arr[index] = charNum;
        //将数组转换成字符串的形式
        String str = new String(arr);
        return str;
    }
}
