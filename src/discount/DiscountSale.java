package discount;

public class DiscountSale implements DiscountStrategy{
    @Override
    public double calculateDiscountedBill(double billAmount) {
        return billAmount - (billAmount * 0.1);
    }
}
