import java.util.Random;

/*抢红包
一个大V直播抽奖，奖品是现金红包，分别有(2,588,888,1000,10000}五个奖金。
请使用代码模拟抽奖打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下:(随机顺序，不一定是下面的顺序)
 */
public class Test23 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] arr1 = new int[5];
        for (int i = 0; i < arr.length;) {
            int j = r.nextInt(5);
            int price = arr[j];
            boolean flag = Judge(arr1, price);
            if (!flag) {
                arr1[i] = price;
                i++;
            }

        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("第" + (i + 1) + "个奖项为:" + arr1[i]);
        }
    }

    public static boolean Judge(int[] arr, int price) {
        for (int i = 0; i < 5; i++) {
            if (arr[i] == price) {
                return true;
            }
        }
        return false;
    }
}