public class Customer {
    public String name;
    double joiningFee;
    BillingStrategy discountStrategy;
    SeatingStrategy seatingStrategy;

    public Customer() {
        this.joiningFee = 0;
        this.discountStrategy = new NoDiscountStrategy();
        this.seatingStrategy = new SeatingFirstThreeRow();
        		
    }

    public String getName() {
        return name;
    }

    public double applyDiscount(double price) {
        return discountStrategy.applyDiscount(price);
    }
    public void reserveSeat() {
        seatingStrategy.reserveSeat();
    }
    
}