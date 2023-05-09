package discount;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<CustomerOrder> orders = new ArrayList<>();

        //Discount types S for Sale, D for Discount, L for Liquidation
        orders.add(new CustomerOrder("William Walters", 75.34, 'D'));
        orders.add(new CustomerOrder("Susan Smothers", 24.12, 's'));
        orders.add(new CustomerOrder("Jessica Johnson", 273.93, 'L'));
        orders.add(new CustomerOrder("Richard Ricardo", 171.42, 'D'));

        double total = 0;
        for (CustomerOrder order : orders) {
            System.out.printf("%-20s $%7.2f\n", order.getCustomerName(), order.getBillAmount());
            total += order.getBillAmount();
        }

        System.out.printf("%-20s $%7.2f", "Total: ", total);
    }
}
