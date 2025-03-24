package test2;

public class B {
    public static void main(String[] args) {
        String A = "abcde";
        String B = "bcdea";

        boolean flag = isSame(A,B);

        System.out.println(flag);

    }

    //旋转字符串
    public static String rotateString1(String A) {
        StringBuilder sb =new StringBuilder();
        char start = A.charAt(0);
        String str = A.substring(1);
        sb.append(str).append(start);
        return sb.toString();
    }

    public static String rotateString2(String A) {
        char[] arr = A.toCharArray();
        char start = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = start;
        String res = new String(arr);
        return res;
    }

    //A和B是否相同
    public static boolean isSame(String A,String B){
        for (int i = 0; i < A.length(); i++) {
            A = rotateString2(A);
            if (A.equals(B)) {
                return true;
            }
        }
        return false;
    }

}
