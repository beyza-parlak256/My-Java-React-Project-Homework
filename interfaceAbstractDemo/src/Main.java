import java.time.LocalDate;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Concrete.NeroCustomerManager;
import interfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.Entities.Customer;


public class Main {

	public static void main(String[] args) {


		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		baseCustomerManager.save(new Customer(1, "Hüseyin Sefa", "Ceren", LocalDate.of(2000,1,26), "60124524554"));
	}

}
