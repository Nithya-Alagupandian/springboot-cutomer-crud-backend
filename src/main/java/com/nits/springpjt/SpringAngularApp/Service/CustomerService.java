package com.nits.springpjt.SpringAngularApp.Service;

import com.nits.springpjt.SpringAngularApp.DTO.CustomerDTO;
import com.nits.springpjt.SpringAngularApp.DTO.CustomerSaveDTO;
import com.nits.springpjt.SpringAngularApp.DTO.CustomerUpdateDTO;
import com.nits.springpjt.SpringAngularApp.entity.Customer;

import java.util.List;

public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);
    List<CustomerDTO> getAllCustomer();
    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);
    boolean deleteCustomer(int id);
}
