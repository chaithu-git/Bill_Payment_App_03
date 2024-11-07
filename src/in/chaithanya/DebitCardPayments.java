package in.chaithanya;

public class DebitCardPayments implements IPayment{
	
	@Override
	public String pay(double amount) {
		// logic for debit card payment
		return "Payment Successful through Debit Card";
	}


}
