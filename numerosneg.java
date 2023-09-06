import java.util.Scanner;
public class numerosneg {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int numPositivos = 0;
    int numNegativos = 0;
    int num;

        do {
        System.out.println("Ingrese un número entero (0 para terminar):");
        num = entrada.nextInt();
        if (num > 0) {
            numPositivos++;
        } else if (num < 0) {
            numNegativos++;
        }
    } while (num != 0);

        System.out.print("positivos: ");
        for (int i = 0; i < numPositivos; i++) {
        System.out.print("*");
    }

        System.out.println(); // Salto de línea

        System.out.print("negativos: ");
        for (int i = 0; i < numNegativos; i++) {
        System.out.print("*");
    }
}
 }
