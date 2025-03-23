package tset1;

import java.util.StringJoiner;

public class A {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }
        String s = sj.toString();
        System.out.println(s);
    }
}
