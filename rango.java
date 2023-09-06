import java.util.Scanner;
public class rango {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de datos: ");
        int numDatos =entrada.nextInt();

        int[] datos = new int[numDatos];

        // Utilizando un ciclo for para ingresar los datos
        for (int i = 0; i < numDatos; i++) {
            System.out.print("Ingrese el dato " + (i + 1) + ": ");
            datos[i] =entrada.nextInt();
        }

        // Calcular el rango utilizando un ciclo while
        int maximo = datos[0];
        int minimo = datos[0];
        int i = 1;

        while (i < numDatos) {
            if (datos[i] > maximo) {
                maximo = datos[i];
            }
            if (datos[i] < minimo) {
                minimo = datos[i];
            }
            i++;
        }

        int rango = maximo - minimo;
        System.out.println("El rango de los datos ingresados es: " + rango);
    }
}
