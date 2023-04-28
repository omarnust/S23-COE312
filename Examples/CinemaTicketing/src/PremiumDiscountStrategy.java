public class PremiumDiscountStrategy implements BillingStrategy {
    private static final double DISCOUNT_PERCENTAGE = 0.25;

    @Override
    public double applyDiscount(double price) {
    	System.out.println("25% Discount applied");
        return price * (1 - DISCOUNT_PERCENTAGE);
    }
}