import java.util.Comparator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class TPManager {


    private final LinkedList<TP> queue = new LinkedList<TP>();

    private final Map<Student, LinkedList<TP>> tps = new TreeMap<>();

    TPManager()
    {

    }


    public void deliver(TP tp) {

        queue.push(tp);

        queue.sort(
            new Comparator<TP>(){
        @Override
        public int compare(TP o1, TP o2) {
            return o1.getStudent().getPromedio() != o2.getStudent().getPromedio()
                    ? -Integer.compare(o1.getStudent().getPromedio(), o2.getStudent().getPromedio())
                    : String.CASE_INSENSITIVE_ORDER.compare(o1.getStudent().getName(), o2.getStudent().getName());
        }});


        if(!tps.containsKey(tp.getStudent()))
            tps.put(tp.getStudent(), new LinkedList<TP>());

        tps.get(tp.getStudent()).push(tp);
    }

    public TP correct() throws EmptyTPsException{ //corregir el primer tp, y lo saca de la cola// primero por promedio, y despues por orden de llegada

        TP a =  queue.pollFirst();

        if (a != null){
        if (!tps.get(a.getStudent()).isEmpty()) tps.get(a.getStudent()).pollFirst();

        return a;
        }

        throw new EmptyTPsException();
    }

    public boolean isEmpty() {

        return queue.isEmpty();
    }

    public String studentsTps() {
        return tps.toString() ;

    }
}
