package doudizhu3;
//按照牌的价值进行排序

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {

    static ArrayList<String> list = new ArrayList<>();

    //用来添加牌的价值
    static HashMap<String, Integer> hm = new HashMap<>();

    //创建牌库
    static {
        String[] color = {"♦", "♠", "♥", "♣"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String s : color) {
            for (String n : number) {
                list.add(s + n);
            }
        }
        list.add(" 大王");
        list.add(" 小王");

        //给牌添加指定的价值
        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("小王",50);
        hm.put("大王",100);
    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);

        //发牌
        ArrayList<String> dipai = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i <= 2) {
                dipai.add(list.get(i));
            } else if (i % 3 == 0){
                player1.add(list.get(i));
            } else if (i % 3 == 1){
                player2.add(list.get(i));
            } else {
                player3.add(list.get(i));
            }
        }

        System.out.println(dipai);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

        order(dipai);
        order(player1);
        order(player2);
        order(player3);

        lookPoker("底牌", dipai);
        lookPoker("玩家一", player1);
        lookPoker("玩家二", player2);
        lookPoker("玩家三", player3);
    }

    //根据牌价值进行排序
    public void order(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);

                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);

                int i = value1 - value2;
                return i == 0 ? color1.compareTo(color2) : i;
            }
        });

    }

    //获得牌的价值
    public int getValue (String o) {
        String number = o.substring(1);
        if (hm.containsKey(number)) {
            //hm里面存在这个数的价值
            return hm.get(number);
        } else {
            //hm里面不存在这个数的价值
            return Integer.parseInt(number);
        }
    }

    //看牌
    public void lookPoker(String name, ArrayList<String> player) {
        System.out.print(name + ": ");

        for (String s : player) {
            System.out.print(s + " ");
        }

        System.out.println();
    }
}