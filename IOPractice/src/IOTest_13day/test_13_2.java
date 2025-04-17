package IOTest_13day;
//练习一：爬取姓氏

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test_13_2 {
    public static void main(String[] args) throws IOException {
        //定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";
        //爬取数据
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);
        //用正则表达式过滤
        ArrayList<String> familyNameTempList = getData(familyNameStr, "(\\W{4})(。| ，)", 1);
        ArrayList<String> boyNameTempList = getData(boyNameStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> girlNameTempList = getData(girlNameStr, "(\\W{2} ){4}\\W{2}", 0);

        //处理数据
        //创建存储姓氏的集合
        ArrayList<String> familyList = new ArrayList<>();
        for (String str : familyNameTempList) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                familyList.add(ch + "");
            }
        }

        //创建存储男生名字的集合,去重
        ArrayList<String> boyList = new ArrayList<>();
        for (String str : boyNameTempList) {
            if (!boyList.contains(str)) {
                boyList.add(str);
            }
        }

        //创建存储女生名字的集合,去重
        ArrayList<String> girlList = new ArrayList<>();
        for (String str : girlNameTempList) {
            String[] s = str.split(" ");
            for (String str1 : s) {
                if (!girlList.contains(str1)) {
                    girlList.add(str1);
                }
            }
        }

        //生成数据
        //姓名（唯一）-性别-年龄
        ArrayList<String> name = getInfos(familyList, boyList, girlList, 70, 50);
        Collections.shuffle(name);
        System.out.println(name);

        //写入数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("IOPractice\\爬取姓名.txt"));
        for (String str : name) {
            bw.write(str);
            //换行
            bw.newLine();
        }
        bw.close();
    }

    public static ArrayList<String> getInfos(ArrayList<String> familyList, ArrayList<String> boyList, ArrayList<String> girlList, int boyCount, int girlCount) {
        HashSet<String> boysHs = new HashSet<>();
        Random r = new Random();
        while (true) {
            if (boysHs.size() > boyCount) {
                break;
            }
            Collections.shuffle(familyList);
            Collections.shuffle(boyList);
            int age = r.nextInt(10) + 18;
            boysHs.add(familyList.get(0) + boyList.get(0) + "-男-" + age);
        }

        HashSet<String> girlsHs = new HashSet<>();
        while (true) {
            if (girlsHs.size() > girlCount) {
                break;
            }
            Collections.shuffle(familyList);
            Collections.shuffle(girlList);
            int age = r.nextInt(10) + 18;
            girlsHs.add(familyList.get(0) + girlList.get(0) + "-女-" + age);
        }

        ArrayList<String> list = new ArrayList<>();
        for (String str : boysHs) {
            list.add(str);
        }
        for (String str : girlsHs) {
            list.add(str);
        }

        return list;
    }

    private static ArrayList<String> getData(String str, String regex, int index) {
        //创建集合存放数据
        ArrayList list = new ArrayList();
        //按照正则表达式来指定规则
        Pattern pattern = Pattern.compile(regex);
        //按照正则表达式的规则获取str里面的数据
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group(index));
        }
        return list;
    }

    public static String webCrawler(String net) throws IOException {
        //定义StringBuilder来拼接爬取的数据
        StringBuilder sb = new StringBuilder();
        //创建URL对象
        URL url = new URL(net);
        //链接网址
        //注意网址可以访问
        URLConnection coon = url.openConnection();
        //读取数据
        InputStreamReader isr = new InputStreamReader(coon.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        isr.close();

        return sb.toString();
    }

}
