package UnidaysDiscountChallenge;

import UnidaysDiscountChallenge.Discount.*;
import UnidaysDiscountChallenge.Item.*;

public class Main {
    public static void main(String[] args) {
        // Create Items
        A itemA = new A();
        B itemB = new B();
        C itemC = new C();
        D itemD = new D();
        E itemE = new E();

        // Create Discounts
        Discount discountB = new DiscountB();
        Discount discountC = new DiscountC();
        Discount discountD = new DiscountD();
        Discount discountE = new DiscountE();

        // Set Pricing Rules
        PricingRules pricingRules = new PricingRules();
        pricingRules.addRule(itemB, discountB);
        pricingRules.addRule(itemC, discountC);
        pricingRules.addRule(itemD, discountD);
        pricingRules.addRule(itemE, discountE);


        UnidaysDiscountChallenge example = new UnidaysDiscountChallenge(pricingRules);

        example.AddToBasket(itemA);
        example.AddToBasket(itemB);
        example.AddToBasket(itemB);
        example.AddToBasket(itemC);
        example.AddToBasket(itemC);
        example.AddToBasket(itemC);
        example.AddToBasket(itemD);
        example.AddToBasket(itemD);
        example.AddToBasket(itemE);
        example.AddToBasket(itemE);
        example.AddToBasket(itemE);
        example.AddToBasket(itemE);

        BasketTotal result = example.CalculateTotalPrice();

        Double totalPrice = result.Total;
        Double deliveryCharge = result.DeliveryCharge;
        Double overallTotal = totalPrice + deliveryCharge;

        System.out.println("Total price is: £" + totalPrice);
        System.out.println("Delivery charge is: £" + deliveryCharge);
        System.out.println("Overall total price is: £" + overallTotal);
    }
}
