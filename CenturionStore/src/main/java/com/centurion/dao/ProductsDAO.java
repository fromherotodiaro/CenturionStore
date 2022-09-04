package com.centurion.dao;

import java.util.List;

import com.centurion.entity.Products;

public interface ProductsDAO {
	Products findById(Integer id);
	List<Products> findAll();
	Products create(Products entity);
	void update(Products entity);
	Products delete(Integer id);
}
