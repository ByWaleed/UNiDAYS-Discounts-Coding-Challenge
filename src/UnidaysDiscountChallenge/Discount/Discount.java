package UnidaysDiscountChallenge.Discount;

import UnidaysDiscountChallenge.Item.Item;
import UnidaysDiscountChallenge.UnidaysDiscountChallenge;

public abstract class Discount {
    protected Integer quantity;
    protected Double price;

    public Discount(Integer quantity, Double price) {
        this.quantity =  quantity;
        this.price = price;
    }

    public abstract Double getDiscountPrice(Item item, Integer buyingQuantity);
}
