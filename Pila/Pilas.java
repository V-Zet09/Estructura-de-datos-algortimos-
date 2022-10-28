import java.util.Arrays;
import java.util.Scanner;


public class Pilas {

    Scanner leer=new Scanner(System.in);
    int Pila[] = new int[10];
    int cima =-1;

    public void insertar(){
       if (cima >=Pila.length-1){
           System.out.println("La Pila está llena");
           System.out.println(" ");
       }else {
           cima+=1;
           System.out.println("Ingrese los valores");
           Pila[cima] = leer.nextInt();
       }
    }

    public void Eliminar(){
        if (cima ==-1){
            System.out.println("La pila está vacia");
            System.out.println(" ");
        }else {
            System.out.println("Se ha eliminado un valor de la pila");
            Pila[cima]=0;
            cima--;
        }
    }


    public void mostrar(){
        for (int cima =9;cima>=0;cima--){
            System.out.println("Datos de la Pila: "+Pila[cima]);
        }
    }

    public void imprimir(){
        System.out.println(" ");
        System.out.println("Secuencia original del Array");
        System.out.println(Arrays.toString(Pila));
        System.out.println(" ");
    }
}