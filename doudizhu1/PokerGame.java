package doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {

    static ArrayList<String> list = new ArrayList<>();

    //创建牌库
    static {
        String[] color = {"♦", "♠", "♥", "♣"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String s : color) {
            for (String n : number) {
                list.add(s + n);
            }
        }
        list.add("大王");
        list.add("小王");
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
            } else if (i % 3 == 0) {
                player1.add(list.get(i));
            } else if (i % 3 == 1) {
                player2.add(list.get(i));
            } else {
                player3.add(list.get(i));
            }
        }

        lookPoker("底牌", dipai);
        lookPoker("玩家一", player1);
        lookPoker("玩家二", player2);
        lookPoker("玩家三", player3);

        System.out.println(list);
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
