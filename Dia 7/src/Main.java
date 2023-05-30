import java.util.*;

// Desafio 1

/*public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}*/

// Desafio 2

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (n % 2 == 1)
            System.out.println("Impar");
        else {
            if (n >= 2 && n <= 5)
                System.out.println("A");
            else if (n >= 6 && n <= 20)
                System.out.println("B");
            else
                System.out.println("C");
        }
    }
}*/

// Desafio 3

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o num1 op num2 (2 * 4): ");

        Scanner s = new Scanner(System.in);

        double num1 = s.nextDouble();
        char op = s.next().charAt(0);
        double num2 = s.nextDouble();

        if (op == '+')
            System.out.println((int)num1 + num2);
        else if (op =='-')
            System.out.println((int)num1 - num2);
        else if(op == '*')
            System.out.println((int)num1 * num2);
        else if(op == '/')
            System.out.println(num1 / num2);
        else
            System.out.println("Formato inválido!");
    }
}