import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * TrianguloPascal
 * 
 * @author Jaasiel Guerra
 */
public class TrianguloPascal {
    public static void main(final String[] args) {

        Vector<Integer> filaAnterior = new Vector<Integer>();// representa la fila anterior
        Vector<Integer> nuevaFila = new Vector<Integer>();// para agregar nuevas filas
        List<Vector> listaFilas = new ArrayList<Vector>();// lista de filas

        for (int i = 0; i < 3; i++)// aniadiendo valores a la primera fila
            filaAnterior.add(i % 2);

        listaFilas.add(filaAnterior);//aniadir la primera fila

        for (int f = 0; f <= 8; f++) {// solo ocho filas
            for (int i = 0; i < filaAnterior.size() - 1; i++) { // aniadiendo filas

                if (i == 0)
                    nuevaFila.add(0);

                nuevaFila.add(Integer.parseInt(filaAnterior.get(i).toString())
                        + Integer.parseInt(filaAnterior.get(i + 1).toString()));

                if (i == filaAnterior.size() - 2)
                    nuevaFila.add(0);
            }

            listaFilas.add(nuevaFila);// agrego la nueva fila
            /*
             * ahora la fila anterior tomara los valores de la que acaba de crearse, porque
             * en la siguiente iteracion se creara una nueva fila a partir de ella
             */
            filaAnterior = nuevaFila;
            nuevaFila = new Vector<Integer>();// la nueva fila se vuelve a inicializar
        }
        // imprimir los vectores
        listaFilas.forEach((x) -> System.out.println(x));
    }
}