package Test1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test3 {
    public static void main(String[] args) {
        /*public string replaceAll(string regex,string newstr)      按照正则表达式的规则进行替换
        public string[] split(string regex):     按照正则表达式的规则切割字符串

        有一段字符串:小诗诗dqwefqwfqwfwg12312小丹丹dqwefqwfqwfwg12312小惠惠
        要求1:把字符串中三个姓名之间的字母替换为vs
        要求2:把字符串中的三个姓名切割出来
        */

        String s = "小诗诗dqwefqwfqwfwg12312小丹丹dqwefqwfqwfwg12312小惠惠";
        String regex1 = s.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(regex1);

        String[] arr = s.split("[\\w&&[^_]]+");
        for (String arr1 : arr) {
            System.out.println(arr1);
        }

    }
}
