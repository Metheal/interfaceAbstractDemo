package adapters;

import abstracts.CustomerCheckService;
import entities.Customer;
import mernisServiceReference.PFIKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        PFIKPSPublicSoap client = new PFIKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
    }
}
