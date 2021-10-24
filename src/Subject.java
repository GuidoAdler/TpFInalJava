public class Subject {

    private TPManager manager;
    Teacher teacher;
    public Subject(Teacher teacher, int i, String s) {
        this.teacher = teacher;
        manager = new TPManager();
    }

    public void addStudent(Student student) {
        teacher.addStudent(student);
    }

    public TPManager getTpManagment() {
        return manager ;
    }
}
