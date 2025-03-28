package test1;

public class Lecturer extends Teacher {

    public Lecturer() {
    }

    public Lecturer(String name, String id) {
        super(name, id, "Lecturer");
    }

    @Override
    public void work() {
        System.out.println(getName() + "讲课");
    }

}
