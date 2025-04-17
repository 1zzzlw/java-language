package IOTest_14day;
//随机点名 用到权重
//每次被点到的学生，再次被点到的概率在原先的基础上降低一半

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class test_14_5 {
    public static void main(String[] args) throws IOException {
        //读取数据
        File file = new File("IOPractice\\src\\IOTest_14day\\随即点名器三(带权重).txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<Student> list = new ArrayList<>();
        //将数据添加到集合中
        String line;
        while ((line = br.readLine()) != null) {
            String[] str = line.split("-");
            Student s = new Student(str[0], str[1], Integer.parseInt(str[2]), Double.parseDouble(str[3]));
            list.add(s);
        }
        br.close();
        //有了学生对象的集合，开始随机抽取，先计算出总权重
        double weight = 0;
        for (Student s : list) {
            weight += s.getWeight();
        }
        //然后计算每个人的个人权重占比
        double[] arr = new double[list.size()];
        int index = 0;
        for (Student s : list) {
            arr[index] = s.getWeight() / weight;
            index++;
        }
        //知道了每个人的权重占比，求出权重范围，用来获得索引
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        System.out.println(Arrays.toString(arr));
        //生成随机数，连接索引
        double n = Math.random();
        //根据二分查找获得数组索引
        int i = -Arrays.binarySearch(arr, n) - 1;
        //根据索引，找到对应范围的学生对象
        Student stu = list.get(i);
        //将该学生的权重除2，并将权重数据存入文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        double w = stu.getWeight() / 2;
        stu.setWeight(w);
        for (Student s : list) {
            bw.write(s.toString());
            bw.newLine();
        }
        bw.close();
    }
}
