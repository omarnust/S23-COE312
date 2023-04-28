
public class GoldDiscountStrategy implements BillingStrategy {
    private static final double DISCOUNT_PERCENTAGE = 0.5;

    @Override
    public double applyDiscount(double price) {
    	System.out.println("50% Discount applied");
        return price * (1 - DISCOUNT_PERCENTAGE);
    }
}
