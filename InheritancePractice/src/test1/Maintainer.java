package test1;

public class Maintainer extends AdminStaff {
    public Maintainer() {
    }

    public Maintainer(String name, String id) {
        super(name, id, "Maintainer");
    }

    @Override
    public void work() {
        System.out.println(getName() + "维护");
    }
}
