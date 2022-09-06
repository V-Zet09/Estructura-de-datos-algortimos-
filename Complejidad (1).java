public class Complejidad {

    /* Primer algoritmo usando un ciclo para realizar la suma  */
    public double Algoritmo1(double n) {
        double suma = 0;

        double startTime = System.nanoTime();
        for(double x = 1; x <= n+1; x++) {
            suma += x;
        }

        double endTime = System.nanoTime();

        double timeElapsed = endTime - startTime;
        System.out.println("El tiempo de ejecucion fue en nanosegundos: " + timeElapsed);
        System.out.println("El tiempo de ejecucion fue en  milisegudos: " + timeElapsed / 1000000);
        return suma;
    }

    public static void main(String[] args)  {

        Complejidad complejidad = new Complejidad();

        complejidad.Algoritmo1(200000);
    }
}