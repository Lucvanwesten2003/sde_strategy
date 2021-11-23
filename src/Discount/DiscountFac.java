package Discount;

import com.hz.SalesAction;

public class DiscountFac {
    public static Discount getDiscountBySalesAction(SalesAction action) {

        if (action == SalesAction.NoAction) return new NoSalesAction();

        if (action == SalesAction.BlackFriday) return new BlackFriday();

        if (action == SalesAction.ChristmasEve) return new ChristmasEve();

        throw new IllegalArgumentException("Enum value: " + action + " is not supported.");
    }
}