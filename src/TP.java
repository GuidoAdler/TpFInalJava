public class TP implements Comparable{

   private Subject materia;
   private Student estudiante;
   private int entrega;
   private String nombreDePrueba;

    public TP(Subject materia, Student estudiante, int entrega, String nombreDePrueba) {
        this.materia = materia;
        this.estudiante = estudiante;
        this.entrega = entrega;
        this.nombreDePrueba = nombreDePrueba;
    }

    public TP() {

    }

    public Student getStudent() {
        return estudiante;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {

        return "TP  from:  "+ estudiante+"  Name:  " + nombreDePrueba;

    }
}
