//正则表达式练习
package Test1;

public class Regex {
    public static void main(String[] args) {
        /*假如现在要求校验一个qq号码是否正确。
        规则:6位及20位之内，8不能在开头，必须全部是数字先使用目前所学知识完成校验需求然后体验一下正则表达式检验。*/

        String qq = "1234567890";

        System.out.println(qq.matches("[1,9]\\d{5,19}"));
        System.out.println("------------------------");

        //只能是a b c
        System.out.println("a".matches("[abc]")); //true
        System.out.println("z".matches("[abc]")); //false
        System.out.println("ab".matches("[abc]")); //false
        System.out.println("ab".matches("[abc][abc]")); //true
        System.out.println("------------------------");

        //不能出现a b c
        System.out.println("a".matches("[^abc]")); //false
        System.out.println("z".matches("[^abc]")); //true
        System.out.println("zz".matches("[^abc]")); //false
        System.out.println("zz".matches("[^abc][^abc]")); //true
        System.out.println("------------------------");

        //a到z A到Z（包括头尾）
        System.out.println("a".matches("[a-zA-Z]")); //true
        System.out.println("z".matches("[a-zA-Z]")); //true
        System.out.println("aa".matches("[a-zA-Z]")); //false
        System.out.println("zz".matches("[a-zA-Z]")); //false
        System.out.println("zz".matches("[a-zA-Z][a-zA-Z]")); //false
        System.out.println("------------------------");

        //[a-d[m-p]] a到d 或者 m到p的范围内
        System.out.println("a".matches("[a-d[m-p]]")); //true
        System.out.println("e".matches("[a-d[m-p]]")); //false
        System.out.println("------------------------");

        //[a-z&&[def]] a-z和def的交集为def
        //如果&&写成了一个&，则不表示任何含义
        System.out.println("a".matches("[a-z&[def]]")); //true
        System.out.println("&".matches("[a-z&[def]]")); //true
        System.out.println("a".matches("[a-z&&[def]]")); //true
        System.out.println("d".matches("[a-z&&[def]]")); //true
        System.out.println("------------------------");

        //[a-z&&[^bc]] 等同于ad到z
        System.out.println("a".matches("[a-z&&[^bc]]")); //true
        System.out.println("b".matches("[a-z&&[^bc]]")); //false
        System.out.println("------------------------");

        //[a-z&&[^m-p]] a到z和除了m到p的交集
        System.out.println("a".matches("[a-z&&[^m-p]]")); //true
        System.out.println("m".matches("[a-z&&[^m-p]]")); //false
        System.out.println("0".matches("[a-z&&[^m-p]]")); //false
        System.out.println("------------------------");

        //.表示任意字符
        System.out.println("你".matches("..")); //fasle
        System.out.println("你".matches(".")); //true
        System.out.println("你a".matches("..")); //true
        System.out.println("------------------------");

        // \\d表示任意数字
        System.out.println("a".matches("\\d")); //fasle
        System.out.println("3".matches("\\d")); //true
        System.out.println("333".matches("\\d")); //fasle
        System.out.println("------------------------");

        // \\w只能是一位单词字符
        System.out.println("z".matches("\\w")); //true
        System.out.println("2".matches("\\w")); //true
        System.out.println("21".matches("\\w")); //fasle
        System.out.println("你".matches("\\w")); //fasle
        System.out.println("------------------------");

        //非单词字符
        System.out.println("你".matches("\\W")); //true
        System.out.println("------------------------");

        



    }


}
