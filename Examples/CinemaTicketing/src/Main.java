/*
 * Imagine building a cinema ticketing app.
 
There are three types of customers:
1.	Normal customers, no joining fee
2.	Premium Customers, joining fee of AED 50
3.	Gold Customers, joining fee of AED 100

All customers can buy 1 or more movie tickets at one time. Normal customers are given no discount. 
Premium customers are given 25% discount. Gold customers are given 50% discount. 
Normal customers can book the first three rows of the cinema. 
Premium and gold customers can book seat in any row of the cinema. 

Use strategy design pattern to implement the above scenario. Draw class hierarchy and write class implementations.

 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer normalCustomer1 = new Customer();
		Customer goldCustomer1 = new GoldCustomer(new GoldDiscountStrategy(), new SeatingAnyRow());
		Customer premiumCustomer1 = new PremiumCustomer(new PremiumDiscountStrategy(), new SeatingFirstThreeRow());
		
		normalCustomer1.applyDiscount(1002);
		goldCustomer1.applyDiscount(1002);
		premiumCustomer1.applyDiscount(1002);
		
		normalCustomer1.reserveSeat();
		goldCustomer1.reserveSeat();
		premiumCustomer1.reserveSeat();
		
		
		
		
	}

}
