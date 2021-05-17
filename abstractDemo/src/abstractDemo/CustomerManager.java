package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	public void gerCustomers() {
		databaseManager.getData();
	}
}
