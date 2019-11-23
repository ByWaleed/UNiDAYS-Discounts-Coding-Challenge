# UNiDAYS Discounts Coding Challenge
Created a basic discount system for the challenged provided for interns applying at UNiDAYS for Software Engineering role. Learn more about the challenge [here](https://github.com/MyUNiDAYS/tech-placement-challenge).

Language used: **Java 11**

### My Approach
- **Item**: Abstract class which include name and price attributes. Items A - E simply extend the abstract class.
- **Discount**: Abstract class with quantity and price for the discounted item as well as an abstract method called ``getDiscountPrice``. Each discount subclass will have different attributes and logic of calculating the discount.
- **Pricing Rules**: Singleton class which combines items with their respective discount in a hashmap with Item as the key and Discount as the value and `getDiscountPrice` simp,y return the response of the items hash value of `Discount.getDiscountPrice()`
- **Basket Total**: Class with two attributes publically accessible: Total and DeliveryCharge.
- **UniDays Discount Challenge**: Requires PricingRules to be passed in the constructor and `CalculateTotalPrice` method return a `BasketTotal` object with total and delivery charges access.

### Running the code
Download or clone the repository locally and open in an IDE and run Main to see a simple basic example.
