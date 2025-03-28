package test2;

public class test {
    public static void main(String[] args) {
        OldPhone o = new OldPhone();
        NewPhone n = new NewPhone();
/*
        o.call();
        o.message();

        n.call();
        n.message();
        n.playGame();

        usePhone1(o,n);*/

        usePhone2(o);
        usePhone2(n);
    }

    public static void usePhone1(OldPhone o, NewPhone n) {
        o.call();
        o.message();

        n.call();
        n.message();
        n.playGame();

    }

    public static void usePhone2(Phone phone) {
        phone.call();
        phone.message();
        if (phone instanceof Iplay) {
            ((Iplay)phone).playGame();
        }

    }
}
