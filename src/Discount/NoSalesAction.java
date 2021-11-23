package Discount;

import com.hz.Customer;

public class NoSalesAction implements Discount {
    @Override
    public double getDiscount(Customer customer, int index){
        double discount = 0.0;

        if(customer.isRegular()){
            discount = 0.15;
        }

        return discount;
    }
}
