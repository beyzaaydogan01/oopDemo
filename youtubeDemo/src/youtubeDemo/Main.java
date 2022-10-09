package youtubeDemo;

public class Main {

	public static void main(String[] args) {
		/*
		 * //Belleğin stack kısmı Heap kısmında referans kısmı oluşur 
		 * CreditManager creditManager = new CreditManager(); creditManager.Calculate();
		 * creditManager.Save();
		 * 
		 * Customer customer = new Customer(); //örneğini oluşturmak, instance
		 * oluşturmak, instance creation customer.id = 1; customer.city = "Ankara";
		 * 
		 * CustomerManager customerManager = new CustomerManager(customer);
		 * customerManager.Save(); customerManager.Delete();
		 * 
		 * Company company = new Company(); company.taxtNumber = "100000";
		 * company.companyName = "Arçelik"; company.id = 100;
		 * 
		 * CustomerManager customerManager2 = new CustomerManager(new Person());
		 * 
		 * Person person = new Person(); person.nationalIdentity = "";
		 */
		
		//Interface; Genellikle iş yapan sınıfların operasyonlarını imza seviyesinde yazarak yazılımda bağımlılığı önlemek
		
		//IoC Container
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();
		
	}

}
