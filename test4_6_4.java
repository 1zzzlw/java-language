package Test3;

//分块查找（无规律）
public class test4_6_4 {
    public static void main(String[] args) {
        int[] arr = {27, 22, 30, 40, 36, 13, 19, 16, 20, 7, 10, 43, 50, 48};

        block1 b1 = new block1(40, 22, 0, 4);
        block1 b2 = new block1(20, 13, 5, 8);
        block1 b3 = new block1(10, 7, 9, 10);
        block1 b4 = new block1(50, 43, 11, 13);

        int num = 7;

        block1[] blockArr = {b1, b2, b3, b4};

        int index = getIndex(blockArr, arr, num);

        System.out.println(index);
    }

    private static int getIndex(block1[] blockArr, int[] arr, int num) {
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


    //查找在哪个块里面
    public static int findBlock(block1[] blockArr, int num) {
        for (int i = 0; i < blockArr.length; i++) {
            if (num >= blockArr[i].getMin() && num <= blockArr[i].getMax()) {
                return i;
            }
        }
        return -1;
    }

}

class block1 {
    private int max;
    private int min;
    private int startIndex;
    private int EndIndex;

    public block1() {
    }

    public block1(int max, int min, int startIndex, int endIndex) {
        this.max = max;
        this.min = min;
        this.startIndex = startIndex;
        EndIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return EndIndex;
    }

    public void setEndIndex(int endIndex) {
        EndIndex = endIndex;
    }
}