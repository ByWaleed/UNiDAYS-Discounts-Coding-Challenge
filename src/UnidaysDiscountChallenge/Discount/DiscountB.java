package UnidaysDiscountChallenge.Discount;

import UnidaysDiscountChallenge.Item.Item;

public class DiscountB extends Discount {
    public DiscountB() {
        super(2, 20.00);
    }

    @Override
    public Double getDiscountPrice(Item item, Integer buyingQuantity) {
        if (buyingQuantity / this.quantity > 0) {
            return ((buyingQuantity / this.quantity) * this.price) + ((buyingQuantity % this.quantity) * item.getPrice());
        } else {
            return buyingQuantity * item.getPrice();
        }
    }
}
