package UnidaysDiscountChallenge;

import UnidaysDiscountChallenge.Discount.Discount;
import UnidaysDiscountChallenge.Item.*;
import java.util.HashMap;

public class PricingRules {
    private HashMap<Item, Discount> rules;

    public PricingRules() {
        rules = new HashMap<>();
    }

    public void addRule(Item item, Discount discount) {
        rules.put(item, discount);
    }

    public Boolean hasDiscount(Item item) {
        return rules.get(item) != null;
    }

    public Double getDiscountPrice(Item item, Integer qty) {
        return rules.get(item).getDiscountPrice(item, qty);
    }
}