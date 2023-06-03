package oop;

import java.util.List;

public class InvoiceItem {

    private Product product;
    private int amount;
    private int unitPrice;

    public InvoiceItem(Product product, int amount) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = product.getPrice();
    }

    public int totalPrice() {
        return amount * unitPrice;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public int getUnitPrice() {
        return unitPrice;
    }
}
