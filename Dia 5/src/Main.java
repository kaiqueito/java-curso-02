public class Main {
    public static void main(String[] args) {
        productList("Laranja", 6.50);
        productList("Banana", 5.20);
    }
    public static void productList(String productName, Double productValue) {
        System.out.println(productName + " R$ " + productValue);
    }
}