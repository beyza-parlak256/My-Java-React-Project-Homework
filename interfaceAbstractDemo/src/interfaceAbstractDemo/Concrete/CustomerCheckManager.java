package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Abstract.ICustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
		
	}

}
