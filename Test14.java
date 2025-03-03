public class Test14 {
    public static void main(String[] args) {
        int []arr = {11,22,33,44,55};
        System.out.print("[");
        Print(arr);
        System.out.println("]");
    }
    public static void Print(int []arr){

        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                System.out.print(arr[i]);
                continue;
            }

            System.out.print(arr[i] + ",");
        }

    }

}


