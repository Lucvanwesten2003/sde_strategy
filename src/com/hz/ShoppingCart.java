package com.hz;
import products.Product;
import Discount.Discount;

import java.util.ArrayList;

public class ShoppingCart extends ArrayList<Product> {

    private Customer owner;

    public ShoppingCart(Customer customer) {
        this.owner = customer;
    }

    public double getTotalPrice(Discount discount) {

        double totalPrice = 0.0;

        int productCount = this.size();

        for(Product product : this) {

            int index = this.indexOf(product);

            double multiplier = 1 - discount.getDiscount(this.owner, index);
            double price = product.getPrice() * multiplier;

            totalPrice += price;
        }

        return totalPrice;
    }
}