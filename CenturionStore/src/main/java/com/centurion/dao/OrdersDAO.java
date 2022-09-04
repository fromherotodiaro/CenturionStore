package com.centurion.dao;

import java.util.List;

import com.centurion.entity.Orders;

public interface OrdersDAO {
	Orders findById(Integer id);
	List<Orders> findAll();
	Orders create(Orders entity);
	void update(Orders entity);
	Orders delete(Integer id);
}
