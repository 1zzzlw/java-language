package Test3;
//分块查找


public class test4_6_3 {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        block b1 = new block(21, 0, 5);
        block b2 = new block(45, 6, 11);
        block b3 = new block(73, 12, 17);

        block[] blockArr = {b1, b2, b3};

        //定义一个变量表示要查找的数字
        int num = 30;

        //获得要查找的数字的索引
        int index = getIndex(blockArr, num, arr);

        if (index == -1) {
            System.out.println("数字不在数组中");
            System.exit(0);
        }

        System.out.println(index);

    }

    private static int getIndex(block[] blockArr, int num, int[] arr) {
        int indexBlock = findBlock(blockArr, num);
        if (indexBlock == -1) {
            return -1;
        }
        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();

        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }


    //查找的数字在哪个块中
    public static int findBlock(block[] blockArr, int num) {
        for (int i = 0; i < blockArr.length; i++) {
            if (num < blockArr[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}

//定义一个分块的类
class block {
    private int max;
    private int startIndex;
    private int endIndex;

    public block() {
    }

    public block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}