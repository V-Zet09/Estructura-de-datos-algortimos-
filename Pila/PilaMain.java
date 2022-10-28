import java.util.Scanner;

public class PilaMain {

    public void Numeros() {
        Scanner prueba = new Scanner(System.in);
        Pilas numero = new Pilas();
        int opciones;
        do {
            System.out.print(" ");
            System.out.println("Pila");
            System.out.println(" ");
            System.out.println("1.-Insertar valores al arreglo");
            System.out.println("2.-Mostrar secuencia original");
            System.out.println("3.-Mostrar elementos de la Pila: ");
            System.out.println("4.-Eliminar elementos: ");
            System.out.println("5.-Terminar la ejecución");
            System.out.println(" ");
            System.out.println("Escoja la opción");
            opciones = prueba.nextInt();
            switch (opciones) {
                case 1:
                    numero.insertar();
                    break;
                case 2:
                    numero.imprimir();
                    break;
                case 3:
                    numero.mostrar();
                    break;
                case 4:
                    numero.Eliminar();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingrese una opcion válida");
            }
        } while (opciones != 5);
    }


    public static void main(String[] args) {
        PilaMain pruebas = new PilaMain();
        pruebas.Numeros();
    }
}