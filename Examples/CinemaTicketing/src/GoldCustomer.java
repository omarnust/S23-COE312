
public class GoldCustomer extends Customer{
	
	public GoldCustomer(BillingStrategy discountStrategy, SeatingStrategy seatingStrategy) {
		this.joiningFee = 100;
        this.discountStrategy = discountStrategy;
        this.seatingStrategy = seatingStrategy;
    }

}
