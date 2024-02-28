package com.codegym.customermanagementthymeleaf.service;

import com.codegym.customermanagementthymeleaf.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService {
    private static final Map<Integer, Customer> customers ;
    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John", "123 Main St", "1234567890"));
        customers.put(2, new Customer(2, "Jane", "456 Main St", "1234567890"));
        customers.put(3, new Customer(3, "Jack", "789 Main St", "1234567890"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
    customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
    customers.remove(id);
    }
}
