package test1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //统一 User 对象
        User user = new User();
        ArrayList<User> users = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("---请选择操作1登录 2注册 3忘记密码---");
            choose = sc.nextInt();
            switch (choose) {
                case 1 -> login(users);
                case 2 -> register(users, user);
                case 3 -> forgetPassword(users, user);
                default -> System.out.println("输入错误，请重新输入");
            }
        }

    }

    //登录
    public static void login(ArrayList<User> users) {
        System.out.println("请输入用户名");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int index = getIndex(users, name);
        int count = 0;
        do {
            if (index < 0) {
                //说明集合内没有输入的用户名，则说明用户名输入错误
                System.out.println("用户名输入错误");
                break;
            } else {
                //说明集合内存在此用户名，且知道了该用户名在集合中的索引就可以输入密码了
                System.out.println("请输入密码");
                String pass = sc.next();
                //判断密码在此集合的索引中是否正确
                boolean flag = containsPassword(users, index, pass);
                if (flag) {
                    System.out.print("密码正确，请输入验证码");
                    inputVerificationCode();
                    System.out.println("登入成功");
                    StudentTest.main(new String[]{});
                    break;
                } else {
                    //说明密码输入的和集合内存在的不相等，输入错误
                    System.out.println("密码输入错误");
                    count++;
                }
            }

        } while (count < 3);

        if (count == 3) {
            System.out.println("错误超过三次，请重新选择");
        }
    }

    //判断密码在该索引下是否正确
    public static boolean containsPassword(ArrayList<User> users, int index, String password) {
        User user = users.get(index);
        String pass = user.getPassword();
        if (pass.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    //判断身份证号在该索引下是否正确
    public static boolean containsIdNumber(ArrayList<User> users, int index, String idNumber) {
        User user = users.get(index);
        String Id = user.getIdNumber();
        if (Id.equals(idNumber)) {
            return true;
        } else {
            return false;
        }
    }

    //判断电话号码在该索引下是否正确
    public static boolean containsIdPhone(ArrayList<User> users, int index, String idPhone) {
        User user = users.get(index);
        String Id = user.getIdPhone();
        if (Id.equals(idPhone)) {
            return true;
        } else {
            return false;
        }
    }

    //注册
    public static void register(ArrayList<User> users, User user) {
        registerUsername(users, user);
        registerPassword(users, user);
        inputIdCardNumber(users, user);
        inputIdPhoneNumber(users, user);
        //最后将完整的User对象添加到集合中，就不需要在各个方法中在逐个添加进集合中了，反而会浪费空间
        users.add(user);
    }

    //忘记密码
    public static void forgetPassword(ArrayList<User> users, User user) {
        System.out.println("请输入用户名");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String name = sc.next();
            boolean flag = contains(users, name);
            if (flag) {
                System.out.println("请输入身份证号");
                int index = getIndex(users, name);
                String idNum = sc.next();
                boolean flag1 = containsIdNumber(users, index, idNum);
                System.out.println("请输入电话号码");
                String idPhone = sc.next();
                boolean flag2 = containsIdPhone(users, index, idPhone);
                if (flag1 && flag2) {
                    System.out.println("验证成功");
                    newRegisterPassword(users, user);
                    break;
                } else {
                    System.out.println("账号信息不匹配，修改失败");
                    break;
                }
            } else {
                System.out.println("用户名不存在，请注册");
                break;
            }
        }
    }

    //查找集合中的该变量是否唯一，即判断此变量是否存在
    public static boolean contains(ArrayList<User> users, String str) {

        /*for (int i = 0; i < users.size(); i++) {
            User Uname = users.get(i);
            String n = Uname.getName();
            if (n.equals(name)) {
                return true;
            }
        }
        return false;*/

        return getIndex(users, str) >= 0;
    }

    //查找集合的索引
    public static int getIndex(ArrayList<User> users, String id) {

        for (int i = 0; i < users.size(); i++) {
            User n = users.get(i);
            if (n.getName().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    //用户名注册
    public static void registerUsername(ArrayList<User> users, User user) {
        System.out.println("请输入要注册的用户名");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String name = sc.next();
            boolean flag = contains(users, name);
            if (flag) {
                System.out.println("用户名已经存在请重新输入");
            } else if (name.length() < 3 || name.length() > 15) {
                System.out.println("用户名长度不合法请重新输入");
            } else if (countLettersInString(name) == 0) {
                System.out.println("用户名不可以只有数字，只能是字母加数字的组合，请重新输入");
            } else if (!isAlphanumeric(name)) {
                System.out.println("用户名内只能是字母和数字不能有其他符号，请重新输入");
            } else {
                user.setName(name);
                System.out.println("用户名注册成功");
                break;
            }
        }
    }

    //判断字符串内有几个字母
    public static int countLettersInString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                count++;
            }
        }
        return count;
    }

    // 判断字符串是否只包含字母和数字
    public static boolean isAlphanumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 检查字符是否为数字（ASCII 码 48 - 57）
            boolean isDigit = c >= '0' && c <= '9';
            // 检查字符是否为大写字母（ASCII 码 65 - 90）
            boolean isUpperCase = c >= 'A' && c <= 'Z';
            // 检查字符是否为小写字母（ASCII 码 97 - 122）
            boolean isLowerCase = c >= 'a' && c <= 'z';
            if (!isDigit && !isUpperCase && !isLowerCase) {
                return false;
            }
        }
        return true;
    }

    //判断字符串是否只包括数字
    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean flag = ch >= '0' && ch <= '9';
            if (!flag) {
                return false;
            }
        }
        return true;
    }

    //密码注册
    public static void registerPassword(ArrayList<User> users, User user) {
        System.out.println("请输入新的密码：");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        System.out.println("请确认密码并再次输入：");
        while (true) {
            String newpassword = sc.next();
            if (newpassword.equals(password)) {
                user.setPassword(newpassword);
                System.out.println("密码注册成功");
                break;
            } else {
                System.out.println("第二次密码输入不正确，请重新输入");
            }
        }
    }

    //忘记密码修改新的密码
    public static void newRegisterPassword(ArrayList<User> users, User user) {
        System.out.println("请输入新的密码：");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        user.setPassword(password);
        users.add(user);
        System.out.println("密码修改成功");
    }

    //身份证号码录入
    public static void inputIdCardNumber(ArrayList<User> users, User user) {
        System.out.println("请输入身份证号码：");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String id = sc.next();
            boolean flag = isIdCardValid(id);
            if (flag) {
                user.setIdNumber(id);
                System.out.println("身份证录入成功");
                break;
            } else {
                System.out.println("请重新输入身份证号码：");
            }
        }
    }

    //验证身份证的合法性
    public static boolean isIdCardValid(String id) {
        if (id.length() != 18) {
            System.out.println("身份证号码不为18位");
            return false;
        }
        if (id.charAt(0) == '0') {
            System.out.println("身份证号码第一位不为0");
            return false;
        }
        if (countLettersInString(id) == 0) {
            return true;
        } else if (countLettersInString(id) == 1 && (id.charAt(17) == 'x' || id.charAt(17) == 'X')) {
            return true;
        } else {
            System.out.println("身份证号码存在错误");
            return false;
        }
    }

    //手机号录入
    public static void inputIdPhoneNumber(ArrayList<User> users, User user) {
        System.out.println("请输入手机号");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String id = sc.next();
            boolean flag = isIdPhoneValid(id);
            if (flag) {
                user.setIdPhone(id);
                System.out.println("手机号录入成功");
                break;
            } else {
                System.out.println("请重新输入手机号：");
            }
        }
    }

    //验证手机号的合法性
    public static boolean isIdPhoneValid(String id) {
        if (id.length() != 11) {
            System.out.println("手机号码不为11位");
            return false;
        }
        if (id.charAt(0) == '0') {
            System.out.println("手机号码第一位不为0");
            return false;
        }
        if (!isNumeric(id)) {
            System.out.println("手机号码存在错误");
            return false;
        } else {
            return true;
        }
    }

    //验证码输入
    public static void inputVerificationCode() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = generateVerificationCode();
            System.out.println(str);
            String code = sc.next();
            if (code.equals(str)) {
                System.out.println("验证码输入正确");
                break;
            } else {
                System.out.println("验证码输入错误，请重新输入");
            }
        }
    }

    //验证码生成
    public static String generateVerificationCode() {
        Random r = new Random();
        char[] arr = new char[5];
        boolean[] bool = new boolean[arr.length];
        for (int i = 0; i < 4; i++) {
            //随机生成true false 两种结果
            boolean isPrime = r.nextBoolean();
            int randomInt;
            //随机生成大小写字母对应的ASCLL码
            if (isPrime) {
                randomInt = r.nextInt(26) + 65;
            } else {
                randomInt = r.nextInt(26) + 97;
            }
            //将大小写转换成字符
            char randomChar = (char) randomInt;
            int index;
            //随机生成索引，并且如果该数组索引有字符，则为true继续循环，否则为false重新随机生成索引
            do {
                index = r.nextInt(5);
            } while (bool[index]);
            //将随机生成的索引赋值true代表这个索引位置已经有值了，下次数组赋值不可以用此索引了
            bool[index] = true;
            arr[index] = randomChar;
        }
        //接下来重复上面的找随机索引的循环将唯一一个没有被赋值的索引找到并赋值一个数字字符
        int num = r.nextInt(10);
        char charNum = (char) (num + '0');
        int index;
        do {
            index = r.nextInt(5);
        } while (bool[index]);
        arr[index] = charNum;
        //将数组转换成字符串的形式
        String str = new String(arr);
        return str;
    }

}
