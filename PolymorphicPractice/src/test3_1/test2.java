package test3_1;

public class test2 {
    public static void main(String[] args) {

        new FunSon() {
            @Override
            void fun() {
                System.out.println("FunSon");
            }

        }.fun();
    }
}