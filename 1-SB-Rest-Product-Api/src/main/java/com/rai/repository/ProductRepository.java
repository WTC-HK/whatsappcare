package com.rai.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rai.binding.Product;

public interface ProductRepository extends JpaRepository<Product, Serializable>{

}
