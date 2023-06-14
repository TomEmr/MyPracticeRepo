package com.example.notesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotesappApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotesappApplication.class, args);
    }

}
//Write SQL query to get all the customer names without an order.
//SELECT customer_name
//FROM customers
//LEFT JOIN orders ON customers.customer_id = orders.customer_id
//WHERE orders.order_id IS NULL;

// Write SQL query to insert a new order for customer_id 1.
// INSERT INTO orders (order_name, customer_id)
//VALUES ('New Order', 1);

//    Write SQL query to update 'John Doe' customer name to 'John Apple'.
//UPDATE customers
//    SET customer_name = 'John Apple'
//    WHERE customer_name = 'John Doe';

//    Write SQL query to list all customer names with number of orders they have
//    SELECT customers.customer_name, COUNT(orders.order_id) AS order_count
//        FROM customers
//        LEFT JOIN orders ON customers.customer_id = orders.customer_id
//        GROUP BY customers.customer_name;

//    Write SQL query to delete customer_id 3
//DELETE FROM customers
//        WHERE customer_id = 3;