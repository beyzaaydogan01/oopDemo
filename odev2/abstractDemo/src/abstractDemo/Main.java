package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseaManager = new MySqlDatabaseManager();
		customerManager.getCustomers();
	}

}