import java.util.Scanner;
import java.util.Random;

public class randomnum {
    public static void main(String[] args) {

        Random random = new Random();
        int numeroAleatorio = random.nextInt(101); // Genera un número aleatorio entre 0 y 100
        int intentos = 0;
        boolean correcto = false;

        Scanner entrada = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Intenta adivinar un número entre 0 y 100.");

        while (!correcto) {
            System.out.print("Ingresa tu suposición: ");
            int idea = entrada.nextInt();
            intentos++;

            if (idea < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (idea > numeroAleatorio) {
                System.out.println("El número es menor.");
            } else {
                correcto = true;
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
            }
        }

    }
}
