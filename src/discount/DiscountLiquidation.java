package discount;

public class DiscountLiquidation implements DiscountStrategy{
    @Override
    public double calculateDiscountedBill(double billAmount) {
        return billAmount - (billAmount * 0.75);
    }
}
