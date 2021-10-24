public class Person {

    protected int dni;
    protected String name;

    public Person(int id, String name) {
        this.dni = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
