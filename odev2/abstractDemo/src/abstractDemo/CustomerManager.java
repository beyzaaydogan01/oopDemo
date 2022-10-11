package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseaManager databaseaManager;
	
	public void getCustomers() {
		databaseaManager.getData();
	}
}
