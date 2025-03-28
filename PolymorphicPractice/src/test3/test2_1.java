package test3;

public class test2_1 {
    public static void main(String[] args) {
        Iplay i = new Iplay() {

            @Override
            public void playGame() {
                System.out.println("Phone is playing game");
            }

        };

        i.playGame();
    }
}
