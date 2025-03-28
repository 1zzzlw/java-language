package test3;

public class test {
    public static void main(String[] args) {
        Phone p1 = new Phone("华为",5999.0);
        Phone p2 = new Phone("小米",3999.0);
        //Phone.size = 7;

        p1.call();
        p1.sendMessage();
        p1.playGame();
        System.out.println(p1.getSize());

        p2.call();
        p2.sendMessage();
        p2.playGame();
        System.out.println(p2.getSize());

    }
}
