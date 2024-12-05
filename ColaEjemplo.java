import java.util.LinkedList;

public class ColaEjemplo {
    private LinkedList<String> cola;

    public ColaEjemplo() {
        cola = new LinkedList<>();
    }

    public void encolar(String elemento) {
        cola.add(elemento);
        System.out.println("Se ha añadido: " + elemento);
    }

    public String desencolar() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía");
            return null;
        } else {
            return cola.removeFirst();
        }
    }

    public static void main(String[] args) {
        ColaEjemplo miCola = new ColaEjemplo();

        miCola.encolar("Tarea 1");
        miCola.encolar("Tarea 2");
        miCola.encolar("Tarea 3");

        System.out.println("Sacando elementos de la cola:");
        while (!miCola.cola.isEmpty()) {
            System.out.println(miCola.desencolar());
        }
    }
}