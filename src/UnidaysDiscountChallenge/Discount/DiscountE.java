package UnidaysDiscountChallenge.Discount;

import UnidaysDiscountChallenge.Item.Item;

public class DiscountE extends Discount {
    public DiscountE() {
        super(3, 10.00);
    }

    @Override
    public Double getDiscountPrice(Item item, Integer buyingQuantity) {
        return ((buyingQuantity / quantity) * price) + ((buyingQuantity % quantity) * item.getPrice());
    }
}
