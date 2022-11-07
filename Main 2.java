import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args){
        Nodo recorrido = new Nodo();

        int valor;
        String Dato;

        System.out.println("Insertando los siguientes valores: ");

        Dato = JOptionPane.showInputDialog("Inserta el numero de nodos que desea ingresar");
        int n = Integer.parseInt(Dato);

        for(int i = 1; i <= n; i++ )
        {
            Dato = JOptionPane.showInputDialog("Dame el " + i + " valor para colocar en el Arbol");
            valor = Integer.parseInt(Dato);
            System.out.print(valor + " ");
            recorrido.Insertar(valor);
        }

        System.out.println("\n\nRecorrido Preorden");
        recorrido.preOrdern();

        System.out.println("\n\nRecorrido Inorden");
        recorrido.inOrden();

        System.out.println("\n\nRecorrido Postorden");
        recorrido.postOrden();
    }
}
