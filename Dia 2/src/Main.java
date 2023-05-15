import java.util.Arrays;

/*public class Main {
    public static void main(String[] args) {
        int[] valores = {10, 20, 15, 30};

        Arrays.sort(valores);
        System.out.printf(Arrays.toString(valores));
        System.out.println(valores.length);

    }
}*/

/*public class Main {
    public static void main(String[] args) {
        String[] carros = {"BMW", "Tesla", "Jeep", "Fiat"};

        System.out.printf(Arrays.toString(carros));
        System.out.println(carros[3]);

    }
}*/

/*public class Main {
    public static void main(String[] args) {
        String[][] carros = {{"BMW", "Tesla"}, {"Jeep", "Fiat"}};
        System.out.println(Arrays.deepToString(carros));

    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int value = (int)Math.round(Math.random() * 100);
        System.out.println(value);
    }
}*/

public class Main {
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
        System.out.println("Original: " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Ordenado: " + Arrays.toString(my_array1));

        System.out.println("Original 2: " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Ordenado 2: " + Arrays.toString(my_array2));
    }
}
