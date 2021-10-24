import java.util.*;

public class Teacher extends Person{


    ArrayList<Subject> materias= new ArrayList<Subject>();

    ArrayList<Student> alumnos= new ArrayList<Student>();

    public Teacher(int id, String name) {
        super(id,name);
    }

    public void addSubject(Subject materia) {
        materias.add(materia);
    }

    public void addStudent(Student alumno){
        alumnos.add(alumno);
        alumnos.sort((
                new Comparator<Student>(){
                    @Override
                    public int compare(Student o1, Student o2) {
                        return String.CASE_INSENSITIVE_ORDER.compare(o1.getName(), o2.getName());
                    }
                }));
    }

    public String studentsInOrder() {
        return alumnos.toString() ;
    }
}
