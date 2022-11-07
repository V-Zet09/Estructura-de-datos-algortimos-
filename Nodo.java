public class Nodo<T> {
    private T raiz;
    private Nodo<T> izq;
    private Nodo<T> der;
    private boolean turno;

    public Nodo() {
        raiz = null;
        izq = null;
        der = null;
        turno = true;
    }

    public void Insertar(T dato) {
        if (estaVacio()) {
            raiz = dato;
            der = new Nodo<>();
            izq = new Nodo<>();
        } else {
            if (turno) {
                izq.Insertar(dato);
            } else {
                der.Insertar(dato);
            }
            turno = !turno;
        }
    }

    public void preOrdern() {
        if (!estaVacio()) {
            System.out.print(raiz.toString()+" ");
            izq.preOrdern();
            der.preOrdern();
        }
    }

    public void inOrden() {
        if (!estaVacio()) {
            izq.inOrden();
            System.out.print(raiz.toString()+" ");
            der.inOrden();
        }
    }

    public void postOrden() {
        if (!estaVacio()) {
            izq.postOrden();
            der.postOrden();
            System.out.print(raiz.toString()+" ");
        }
    }

    public boolean estaVacio() {
        return raiz == null;
    }
}