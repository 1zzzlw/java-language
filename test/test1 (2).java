package Test1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
    public static void main(String[] args) {
        String s = "java自从95年问世以来，经历了很多版本，目前企业中用的最多的是java8和JAva11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是JAVa17，相信在未来不久JAVA17也会遂渐登上历史舞台";

        //需求1:爬取版本号为8,11,17的Java文本，但是只要Java，不显示版本号。
        //需求2:爬取版本号为8,11,17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
        //需求3:爬取除了版本号为8,11,17的Java文本，

        //?问好表示只获取前面的数据
        //=表示java后面跟随的数据
        String regex1 = "(?i)(java)(?=11|8|17)";
        //String regex2 = "(?i)(java)(11|8|17)";
        String regex2 = "(?i)(java)(?:11|8|17)";
        String regex3 = "(?i)(java)(?!11|8|17)";
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            System.out.println(m1.group());
        }
        System.out.println("-----------------------");
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(s);
        while (m2.find()) {
            System.out.println(m2.group());
        }
        System.out.println("-----------------------");
        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(s);
        while (m3.find()) {
            System.out.println(m3.group());
        }



    }
}
