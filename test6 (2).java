package Test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/*
public simpleDateFormat()       默认格式
public simpleDateFormat(string pattern)     指定格式
public final string format(Date date)       格式化(日期对象->字符串)
public Date parse(string source)        解析(字符串->日期对象)
*/

public class test6 {
    public static void main(String[] args) throws ParseException {
        //空参构造默认格式
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = new Date(0L);
        String str1 = sdf.format(d);
        System.out.println(str1);
        //有参构造指定格式 EE表示星期
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str2 = sdf1.format(d);
        System.out.println(str2);

        //定义一个字符串表示时间
        String str3 = "2023-11-11 11:11:11";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf3.parse(str3);
        System.out.println(date);
        //获得毫秒值
        System.out.println(date.getTime());


    }


}
