package discount;

public class DiscountHalfPrice implements DiscountStrategy{
    @Override
    public double calculateDiscountedBill(double billAmount) {
        return billAmount - (billAmount * 0.5);
    }
}
