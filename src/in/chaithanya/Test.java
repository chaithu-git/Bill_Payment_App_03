package in.chaithanya;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception {

		// BillCollector bc=new BillCollector();
		// injecting creditcard obj into BillCollector (setter injection)
		// bc.setPayment(new CreditCardPayment());
		// bc.collectPayment(15000);

		// injecting creditcard obj into BillCollector (constructor injection)
		// BillCollector bc1=new BillCollector(new DebitCardPayments());
		// bc1.collectPayment(2000);

		// System.out.println(bc);
		// TODO Auto-generated method stub

		/*
		 * CreditCardPayment ccd=new CreditCardPayment();// onjecting one cls obj into
		 * another cls obj using variable is called field injection BillCollector bc=new
		 * BillCollector(); bc.payment=ccd; bc.collectPayment(3500);
		 */

		
		  Class<?> clz=Class.forName("in.chaithanya.BillCollector");
		  
		  Field field=clz.getDeclaredField("payment"); 
		  field.setAccessible(true);
		  
		  Object obj=clz.newInstance(); 
		  field.set(obj, new DebitCardPayments());
		 // injecting value to variable
		  
		  BillCollector bc=(BillCollector) obj; bc.collectPayment(2500);
		  
		 

	}

}
