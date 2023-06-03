package oop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Customer implements Comparable<Customer> {

    private static List<Customer> customers = new ArrayList<>();
    private String name;
    private List<Invoice> invoices = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
        customers.add(this);
    }

    public void add(Invoice invoice) {
        invoices.add(invoice);
    }

    public int totalSpent() {
        int sum = 0;
        for (Invoice invoice : invoices
        ) {
            sum += invoice.totalPrice();
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public static List<Customer> topCustomers() {
        List<Customer> topThreeCustomers = new ArrayList<>();

        Collections.sort(customers);
        for (int i = 0; i < 3; i++) {
            topThreeCustomers.add(customers.get(i));
        }
        return topThreeCustomers;
    }

    @Override
    public String toString() {
        return name + ", total spent: " + totalSpent() + "Kč";
    }

    @Override
    public int compareTo(Customer customer) {
        if (this.totalSpent() < customer.totalSpent()) {
            return 1;
        } else if (this.totalSpent() > customer.totalSpent()) {
            return -1;
        } else {
            return 0;
        }
    }
}
