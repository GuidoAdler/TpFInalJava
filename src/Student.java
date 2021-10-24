public class Student extends Person implements Comparable<Student> {

   private final int promedio;

    public Student(int dni, String name, int promedio) {
        super(dni,name);
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return name;
    }


    @Override
    public int compareTo(Student o) {

        return Integer.compare(this.promedio, o.getPromedio());
    }

    public int getPromedio(){
        return promedio;
    }


}
