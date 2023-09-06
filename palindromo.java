import java.util.Scanner;
public class palindromo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = entrada.nextInt();
        int numOriginal = num;
        int numInvertido = 0;

        while (num > 0) {
            int digito = num % 10;
            numInvertido = numInvertido * 10 + digito;
            num /= 10;
        }

        if (numOriginal == numInvertido) {
            System.out.println("El número es un palíndromo.");
        } else {
            System.out.println("El número no es un palíndromo.");
        }
    }
}
