import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("Digite o primeiro número: ");
        Scanner primeiroNumeroScanner = new Scanner(System.in);
        double primeiroNumero = primeiroNumeroScanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        Scanner segundoNumeroScanner = new Scanner(System.in);
        double segundoNumero = segundoNumeroScanner.nextDouble();

        double resultado = primeiroNumero + segundoNumero;

        System.out.println("Resultado da soma = " + resultado);
    }
}