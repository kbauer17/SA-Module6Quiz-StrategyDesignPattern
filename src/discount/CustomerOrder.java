package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private char discountType;

    public CustomerOrder(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountType = discountType;
    }

    public double getBillAmount() {
        double tempBill = 0;
        switch (discountType) {
            case 'S':
            case 's':
                DiscountSale discountSale = new DiscountSale();
                tempBill = discountSale.calculateDiscountedBill(billAmount);
                break;
            case 'D':
            case 'd':
                DiscountHalfPrice discountHalfPrice = new DiscountHalfPrice();
                tempBill = discountHalfPrice.calculateDiscountedBill(billAmount);
                break;
            case 'L':
            case 'l':
                DiscountLiquidation discountLiquidation = new DiscountLiquidation();
                tempBill = discountLiquidation.calculateDiscountedBill(billAmount);
                break;
            default:
                tempBill = billAmount;
        }
        return tempBill;
    }
    
    

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountType
                + '}';
    }
}
