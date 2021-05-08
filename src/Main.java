import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.StarbucksCustomerManager;
import entities.Customer;

import java.time.LocalDate;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer customer = new Customer(1, "Enes", "Yılmaz", LocalDate.of(1998, Calendar.MARCH, 28), "00000000000");

        try {
            customerManager.save(customer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
