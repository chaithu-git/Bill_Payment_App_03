package in.chaithanya;

public class BillCollector {
	
	//public IPayment payment;
	private IPayment payment;  //field injection
	
	public void setPayment(IPayment payment) { // setter injection
		this.payment=payment;
	}
	
	public BillCollector() {

	}
	public  BillCollector(IPayment payment) { // constructor injection
		this.payment=payment;
	}
	
	public void collectPayment(double amount) {
	
		 String status=payment.pay(amount);
		 System.out.println(status);
		
	}
		
	

}
