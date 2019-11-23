package UnidaysDiscountChallenge.Discount;

import UnidaysDiscountChallenge.Item.Item;

public class DiscountD extends Discount {
    public DiscountD() {
        super(2, 7.00);
    }

    @Override
    public Double getDiscountPrice(Item item, Integer buyingQuantity) {
        return ((buyingQuantity / quantity) * price) + ((buyingQuantity % quantity) * item.getPrice());
    }
}
