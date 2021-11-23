package Discount;

import com.hz.Customer;

public class ChristmasEve implements Discount {
    @Override
    public double getDiscount(Customer customer, int index){
        double discount = 0.0;

        boolean isFirstProduct = index == 0;

        if(isFirstProduct) {
            discount = .20;
        } else {
            discount = .125;
        }

        return discount;
    }
}
