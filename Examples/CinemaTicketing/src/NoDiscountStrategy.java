public class NoDiscountStrategy implements BillingStrategy {
    @Override
    public double applyDiscount(double price) {
    	System.out.println("No Discount applied");
        return price;
    }
}
