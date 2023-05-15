/*import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat real = NumberFormat.getCurrencyInstance();
        String productValue = real.format(120.00);

        System.out.println(productValue);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println(a > b);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int priceProduct = 20;
        boolean buy = priceProduct >=10 && priceProduct <= 15;
        System.out.println(buy);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        boolean temEmprego = true;
        boolean temEmpresa = false;
        boolean tem50k = true;
        boolean podeFinanciar = temEmprego || temEmpresa && tem50k;
        System.out.println(podeFinanciar);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int ingresso = 400;
        String terAcesso = ingresso >=500 ? "VIP" : "Pista";

        System.out.println(terAcesso);
    }
}*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lerNumeros = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = lerNumeros.nextInt();

        if(num < 9 && num >=1){
            System.out.println("Este número tem 1 dígito");
        } else if(num < 100 && num >=10) {
            System.out.println("Este número tem 2 dígito");
        } else if(num < 1000 && num >=100) {
            System.out.println("Este número tem 3 dígito");
        } else if(num < 10000 && num >=1000) {
            System.out.println("Este número tem 4 dígito");
        } else if(num < 100000 && num >=10000) {
            System.out.println("Este número tem 5 dígito");
        }
    }
}