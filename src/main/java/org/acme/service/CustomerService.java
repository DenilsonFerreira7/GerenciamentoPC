package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.model.Adm;
import org.acme.repository.CustomerRepository;

import java.util.List;

@ApplicationScoped
public class CustomerService {

    @Inject
    CustomerRepository customerRepository;

    public List<Adm> findAllCustomers(){
      return customerRepository.findAll().list();
    }

    public void addCustomer (Adm adm){
        customerRepository.persist(adm);
    }
}
