package Discount;

import com.hz.Customer;
public class BlackFriday implements Discount {
    @Override
    public double getDiscount(Customer customer, int index){
        double discount = 0.0;

        if(customer.getCart().size() <  8){
            discount = customer.getCart().size() * 0.1;

        }else{
            discount = 0.8;
        }

        System.out.println(discount);

        return discount;
    }
}
