package oop;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private Customer customer;
    private List<InvoiceItem> invoiceItems;

    public Invoice(Customer customer) {
        this.customer = customer;
        this.invoiceItems = new ArrayList<>();
    }

    public int totalPrice() {
        int sum = 0;
        for (InvoiceItem i : invoiceItems
        ) {
            sum += i.getUnitPrice() * i.getAmount();
        }
        return sum;
    }

    public void add(Product product, int amount) {
        invoiceItems.add(new InvoiceItem(product, amount));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice for: " + customer.getName() + "\n");
        for (InvoiceItem item : invoiceItems
        ) {
            sb.append(item.getAmount() + "x " + (item.getProduct().toString() + " " + item.totalPrice() + "Kč \n"));
        }
        sb.append("------\n");
        sb.append("Total " + totalPrice() + "Kč\n");


        return sb.toString();
    }


}
