public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Joao");
        Movie m1 = new Movie("Avatar", 20);
        Rental r1 = new Rental(m1, 7);
        System.out.print("OK!\n"); 
    }
}
