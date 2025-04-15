package FileTest_11day;
//统计一个文件夹中每种文件的个数并打印

import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class test_11_6 {
    public static void main(String[] args) {

        File file = new File("FilePractice\\ccc");
        HashMap<String, Integer> count = getCount(file);
        System.out.println(count);
    }

    public static HashMap<String, Integer> getCount(File file) {
        HashMap<String, Integer> hm = new HashMap<>();

        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                //是文件
                //获得文件名
                String name = f.getName();
                //将文件名进行切割,获得后缀名
                String[] arr = name.split("\\.");
                if (arr.length >= 2) {
                    String endName = arr[arr.length - 1];
                    //判断该后缀名在HashMap是否为空
                    if (hm.containsKey(endName)) {
                        //集合里面不是空的
                        int count = hm.get(endName);
                        count++;
                        hm.put(endName, count);
                    } else {
                        //集合里面是空的
                        hm.put(endName, 1);
                    }
                }

            } else {
                //不是文件是文件夹，进行递归
                HashMap<String,Integer> newHm = getCount(f);

                Set<String> keys = newHm.keySet();
                for (String key : keys) {
                    int value = newHm.get(key);
                    //判断key在hm里面是否存在
                    if (hm.containsKey(key)) {
                        //存在
                        int count = hm.get(key) + value;
                        hm.put(key, count);
                    } else {
                        //不存在
                        hm.put(key, value);
                    }
                }
            }
        }
        return hm;
    }

}
