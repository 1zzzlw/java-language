package doudizhu2;

import javax.security.auth.login.AccountException;
import java.util.*;

public class PokerGame {

    static HashMap<Integer, String> hm = new HashMap<>();
    //存放序号
    static ArrayList<Integer> list = new ArrayList<>();

    //创建牌库
    static {
        String[] color = {"♦", "♠", "♥", "♣"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int count = 1;

        for (String n : number) {
            for (String c : color) {
                hm.put(count, n + c);
                list.add(count);
                count++;
            }
        }

        list.add(count);
        hm.put(count, "大王");
        count++;
        list.add(count);
        hm.put(count, "小王");

    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //发牌
/*        TreeMap<Integer, String> dipai = new TreeMap<>();
        TreeMap<Integer, String> player1 = new TreeMap<>();
        TreeMap<Integer, String> player2 = new TreeMap<>();
        TreeMap<Integer, String> player3 = new TreeMap<>();*/

/*        for (int i = 0; i < list.size(); i++) {
            if (i <= 2) {
                dipai.put(list.get(i), hm.get(list.get(i)));
            } else if (i % 3 == 0) {
                player1.put(list.get(i), hm.get(list.get(i)));
            }  else if (i % 3 == 1) {
                player2.put(list.get(i), hm.get(list.get(i)));
            } else {
                player3.put(list.get(i), hm.get(list.get(i)));
            }
        }*/

        //发牌第二种写法（网课）
        TreeSet<Integer> dipai = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

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

        System.out.println(hm);
        System.out.println(list);
        lookPoker("底牌", dipai);
        lookPoker("玩家一", player1);
        lookPoker("玩家二", player2);
        lookPoker("玩家三", player3);
    }

    private void lookPoker(String name, TreeSet<Integer> player) {
        System.out.print(name + ": ");
        for (int i : player) {
            System.out.print(hm.get(i) + " ");
        }
        System.out.println();
    }


/*  //看牌
    public void lookPoker(String name, TreeMap<Integer, String> player) {
        System.out.print(name + ": ");
        Set<Integer> keys = player.keySet();
        for (Integer key : keys) {
            String value = player.get(key);
            System.out.print(value + " ");
        }
        System.out.println();
    }*/


}
