package UnidaysDiscountChallenge;

import UnidaysDiscountChallenge.Item.Item;

import java.util.HashMap;
import java.util.Map;

public class UnidaysDiscountChallenge {
    private HashMap<Item, Integer> basket;
    private PricingRules pricingRules;

    public UnidaysDiscountChallenge(PricingRules pricingRules) {
        this.basket = new HashMap<>();
        this.pricingRules = pricingRules;
    }

    public void AddToBasket(Item item) {
        if (basket.containsKey(item)) {
            basket.put(item, basket.get(item) + 1);
        } else {
            basket.put(item, 1);
        }
    }

    public BasketTotal CalculateTotalPrice() {
        Double total = 0.00;
        Double delivery = 7.00;

        for (Map.Entry<Item, Integer> entry : basket.entrySet()) {
            Item item = entry.getKey();
            Integer qty = entry.getValue();
            if (pricingRules.hasDiscount(item)) {
                total += pricingRules.getDiscountPrice(item, qty);
            } else {
                total += qty * item.getPrice();
            }
        }

        if (total > 50.00) {
            delivery = 0.00;
        }

        return new BasketTotal(total, delivery);
    }
}
