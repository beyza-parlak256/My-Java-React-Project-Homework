package interfaceAbstractDemo.Abstract;

import interfaceAbstractDemo.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomer{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db : " + customer.firstName);
	}

}
