public class CafeApp {

    public static void main(String[] args) {
        Customer john = new Customer("john acibo", true);
        Customer Joanna = new Customer("Joanna florres", false);
        Beverage Icedcoffe = new Beverage(" Iced coffe", 95.0, "B-01", "L");
        Pastry ensaymada = new Pastry(" Ensaymada", 45.0, "P-01", true);
        Meal porksabaw = new Meal(" porksabaw", 110.0, "M-01", true, 1);
        Pastry extraChocolate = new Pastry(" Chocolate", 25.0, "P-02", false);

        Order order1 = new Order("1001", john);
        order1.addItem(Icedcoffe);
        order1.addItem(ensaymada);
        order1.addItem(porksabaw);

        order1.printReceipt();

        Beverage testBeverage = new Beverage();
        testBeverage.setBaseprice(-5);
        testBeverage.setBaseprice(80.0);

        Beverage IcedCoffee = new Beverage();
        IcedCoffee.setName(" Iced Coffee");
        IcedCoffee.setItemCode("B-02");
        IcedCoffee.setBaseprice(80.0);
        IcedCoffee.setSize("M");

        Meal Seafood = new Meal(" Seafood", 130.0, "M-02", false, 0);

        Order order2 = new Order("1002", Joanna);;
        order2.addItem(IcedCoffee);
        order2.addItem(Seafood);

        order2.printReceipt(20.0);
    }
}
