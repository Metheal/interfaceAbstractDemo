package concretes;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if (this.customerCheckService.CheckIfRealPerson(customer)) {
            super.save(customer);
        }
        else {
            throw new Exception("Not a valid person");
        }
    }
}
