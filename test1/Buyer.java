package test1;

public class Buyer extends AdminStaff {

    public Buyer() {
    }

    public Buyer(String name, String id) {
        super(name, id, "Buyer");
    }

    @Override
    public void work() {
        System.out.println(getName() + "采购");
    }
}
