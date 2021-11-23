package com.hz;

import Discount.Discount;
import Discount.DiscountFac;

public class Checkout {
    private Discount discountStrat;

    public Checkout(SalesAction action) {
        this.discountStrat = DiscountFac.getDiscountBySalesAction(action);
    }

    

    public void nextInLine(Customer customer) {
        // Welcome customer
        String welcome = String.format("Hello %s, would you pass me your shopping cart?",
                customer.getName());
        Console.write(welcome);

        // perform checkout
        ShoppingCart cart = customer.getCart();

        double amountToPay = cart.getTotalPrice(discountStrat);
        String payinfo = String.format("Let's see, that will be.. %.02f. Cash or card?", amountToPay);
        Console.write(payinfo);
    }
}
