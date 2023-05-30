/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Coletar o nome do produto
        System.out.print("Digite o nome do produto: ");
        Scanner s = new Scanner(System.in);
        String nomeProduto = s.next().toLowerCase();
        // Retornar o valor do produto
        switch (nomeProduto) {
            case "banana":
                System.out.println("R$ 9,50");
                break;
            case "manga":
                System.out.println("R$ 12,80");
            case "abacate":
                System.out.println("R$ 16,10");
        }

    }
}*/

/*public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.println("Hi");
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Tesla", "Fiat", "Ferrari"};

        for(int i = 0; i < cars.length; i++)
            System.out.print(cars[i] + " ");
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <2; i++)
            for (int j = 0; j <2; j++)
                System.out.println(i + " " + j);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i + " - Hi");
            i++;
        }
    }
}*/
// Par
/*public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++)
            if (i % 2 == 0)
                System.out.print(i + " ");
    }
}*/
// Impar
/*public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++)
            if (i % 2 != 0)
                System.out.print(i + " ");
    }
}*/

public class Main {
    public static void main(String[] args) {
        String spaces = "Hello World";

        for (int i = 0; i <= spaces.length() - 1; i++)
            System.out.print(spaces.charAt(i) + " ");
    }
}