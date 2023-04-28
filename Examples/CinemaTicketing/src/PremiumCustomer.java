
public class PremiumCustomer extends Customer{
	
	public PremiumCustomer(BillingStrategy discountStrategy, SeatingStrategy seatingStrategy) {
		this.joiningFee = 50;
        this.discountStrategy = discountStrategy;
        this.seatingStrategy = seatingStrategy;
    }

}
