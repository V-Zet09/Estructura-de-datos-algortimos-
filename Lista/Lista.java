public class Lista {


    public class Listas {
        private static Nodo nada;
        private int cantidad;

        public void Lista() {
            nada = null;
            cantidad = 0;
        }

        public static boolean esVacia(){
            System.out.println("¿La lista está vacia?");
            return nada == null;
        }
    }


    public static void main(String[] args){
        Lista Prueba = new Lista();
        System.out.println(Lista.Listas.esVacia());
    }
}