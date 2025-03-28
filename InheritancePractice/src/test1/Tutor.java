package test1;

public class Tutor extends Teacher {
    public Tutor() {
    }

    public Tutor(String name, String id) {
        super(name, id, "Tutor");
    }

    @Override
    public void work() {
        System.out.println(getName() + "助教");
    }
}
