package com.example.CustomerDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CustomerDemo.common.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
