import java.util.Scanner;
public class tiempo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tiempoTotal = 0;
        int tiempoTramo = 1;

        while (tiempoTramo != 0) {
            System.out.println("Ingrese el tiempo del tramo en minutos (0 para terminar):");
            tiempoTramo = entrada.nextInt();
            tiempoTotal += tiempoTramo;
        }

        int horas = tiempoTotal / 60;
        int minutos = tiempoTotal % 60;

        System.out.println("El tiempo total de viaje es: " + horas + " horas " + minutos + " minutos");
    }
}


