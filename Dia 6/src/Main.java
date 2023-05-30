/*public class Main {
    public static void main(String[] args) {
        Clients c001 = new Clients();
        c001.firstName = "Braga";
        c001.age = 23;

        Clients c002 = new Clients();
        c002.firstName = "Jorge";
        c002.age = 18;

        c001.newAccount();
    }
}*/

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X6", 2024, 125000.0);

        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        System.out.println(car.valorVenda());
    }
}