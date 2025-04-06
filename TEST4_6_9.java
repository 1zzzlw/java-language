package Test3;

import java.util.Arrays;
import java.util.Comparator;

public class TEST4_6_9 {
    public static void main(String[] args) {
        GirlFriend g1 = new GirlFriend("xiaoshishi", 18, 1.67);
        GirlFriend g2 = new GirlFriend("xiaodandan", 19, 1.72);
        GirlFriend g3 = new GirlFriend("xiaohuihui", 19, 1.78);
        GirlFriend g4 = new GirlFriend("abcd", 19, 1.78);

        GirlFriend[] arr = {g1, g2, g3, g4};

        Arrays.sort(arr, new Comparator<GirlFriend>() {

            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                if (temp > 0) {
                    return 1;
                } else if (temp < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        //lambda表达式的写法
        Arrays.sort(arr, (GirlFriend o1, GirlFriend o2) -> {
                    double temp = o1.getAge() - o2.getAge();
                    temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                    temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                    if (temp > 0) {
                        return 1;
                    } else if (temp < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
        );

        //lambda表达式的省略写法
        Arrays.sort(arr, (o1, o2) -> {
                    double temp = o1.getAge() - o2.getAge();
                    temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                    temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                    if (temp > 0) {
                        return 1;
                    } else if (temp < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
        );

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + " " + arr[i].getAge() + " " + arr[i].getHeight());
        }

    }
}

class GirlFriend {
    private String name;
    private int age;
    private double height;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}