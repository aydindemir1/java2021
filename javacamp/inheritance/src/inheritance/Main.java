package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.customerNumber = "12345";
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.customerNumber = "67890";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
//		customerManager.add(individualCustomer);
//		customerManager.add(corporateCustomer);
//		customerManager.add(sendikaCustomer);
		
		Customer[] customers = {individualCustomer, corporateCustomer, sendikaCustomer};
		
		customerManager.addMultiple(customers);
		

	}

}
