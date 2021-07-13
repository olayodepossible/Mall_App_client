package com.possible.mallappclient.web.service;

import com.possible.mallappclient.web.Model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customer_id);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customer_id, CustomerDto customerDto);

    void deleteById(UUID customer_id);
}
