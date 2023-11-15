package exercise;

public class E751 {
    public static void main(String[] args) {
        Product p = new Product(001, 600, "comic");
        Stock s001 = new Stock(p, 100);
        System.out.println(s001);

        p.setNumber(810);
        s001.getProduct().setNumber(002);
        System.out.println(s001);
    }
}
