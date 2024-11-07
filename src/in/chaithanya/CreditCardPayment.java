package in.chaithanya;

public class CreditCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		// logic for credit card payment
		return "Payment Successful through Credit Card";
	}

}
