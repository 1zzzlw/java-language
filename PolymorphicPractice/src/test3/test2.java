package test3;
//匿名内部类写法

public class test2 {
    public static void main(String[] args) {

        new Iplay() {

            @Override
            public void playGame() {
                System.out.println("Phone is playing game");
            }

        }.playGame();


    }
}
