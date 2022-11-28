package com.flipkart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flipkart.entities.Flipkart;
public interface FlipkartRepository extends JpaRepository<Flipkart, Long> {

}
