package com.rai.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rai.binding.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable>{

}