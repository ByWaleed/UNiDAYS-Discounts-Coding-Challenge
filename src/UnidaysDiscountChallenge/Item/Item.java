/**
 * Abstract Factory Design Pattern
 * Factory Method - uses Discount class*/

package UnidaysDiscountChallenge.Item;

import UnidaysDiscountChallenge.Discount.Discount;

public abstract class Item {
    private String name;
    private Double price;
    private Discount discount;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
        this.discount = null;
    }

    public Item(String name, Double price, Discount discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public Double getPrice() {
        return this.price;
    }
}
