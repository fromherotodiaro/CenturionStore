package com.centurion.dao;

import java.util.List;

import com.centurion.entity.Customers;

public interface CustomersDAO {
	Customers findById(Integer id);
	List<Customers> findAll();
	Customers create(Customers entity);
	void update(Customers entity);
	Customers delete(Integer id);
}
