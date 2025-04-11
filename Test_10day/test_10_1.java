package Test_10day;

/*需求
        定义一个Map集合，键用表示省份名称province，值表示市city，但是市会有多个。添加完毕后，遍历结果格式如下:
        江苏省=南京市，扬州市，苏州市，无锡市，常州市
        湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
        河北省 =石家庄市，唐山市，邢台市，保定市，张家口市*/

import java.util.*;

public class test_10_1 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> city1 = new ArrayList<>();
        Collections.addAll(city1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        ArrayList<String> city2 = new ArrayList<>();
        Collections.addAll(city2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        ArrayList<String> city3 = new ArrayList<>();
        Collections.addAll(city3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        map.put("江苏省", city1);
        map.put("湖北省", city2);
        map.put("河北省", city3);

        Set<Map.Entry<String,ArrayList<String>>> entries = map.entrySet();
        for (Map.Entry<String,ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(",","","");
            for (String city : value) {
                sj.add(city);
            }
            System.out.println(key + "=" + sj);

        }

    }
}
