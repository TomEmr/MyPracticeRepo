package oop;

public class DiscountedProduct extends Product {


    private int amountDiscount;

    public DiscountedProduct(String name, int price, int amountDiscount) {
        super(name, price);
        this.amountDiscount = amountDiscount;
        setPrice(getPrice() - amountDiscount);
    }
    @Override
    public String toString(){
        return "discounted " + super.toString();
    }
}
