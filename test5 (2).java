package Test1;

public class test5 {
    public static void main(String[] args) {
        String s = "我要学学编编编编程程程程程程";
        String regex = s.replaceAll("(.)\\1+", "$1");
        System.out.println(regex);
    }
}
