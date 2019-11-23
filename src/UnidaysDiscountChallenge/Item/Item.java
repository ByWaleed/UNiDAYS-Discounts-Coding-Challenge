/**
 * Abstract Factory Design Pattern
 * Factory Method - uses Discount class*/

package UnidaysDiscountChallenge.Item;

import UnidaysDiscountChallenge.Discount.Discount;

public abstract class Item {
    private String name;
    private Double price;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }
}
