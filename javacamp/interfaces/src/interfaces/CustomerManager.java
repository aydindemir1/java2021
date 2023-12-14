package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	//loosly - tightly coupled
	public void add(Customer customer) {
      System.out.println("müşteri eklendi : " + customer.getFirstName());
	  
    
      Utils.runLoggers(loggers, customer.getFirstName());
      
      
	}

	public void delete(Customer customer) {
	      System.out.println("müşteri silindi : " + customer.getFirstName());
	
	      Utils.runLoggers(loggers, customer.getLastName());
	}

}
