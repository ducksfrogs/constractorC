//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Customer customer = new Customer("tim", 1000, "tim@mail.com");

            System.out.println(customer.getName() + " " + customer.getEmail());

            Customer customer2 = new Customer();
            System.out.println(customer2.getName() + " " + customer2.getEmail());

            Customer customer3 = new Customer("Joe", "joe@mail.com");
        System.out.println(customer3.getName() + " " + customer3.getEmail());

    }
}