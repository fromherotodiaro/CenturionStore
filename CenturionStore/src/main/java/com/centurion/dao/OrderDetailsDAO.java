package com.centurion.dao;

import java.util.List;

import com.centurion.entity.OrderDetails;

public interface OrderDetailsDAO {
	OrderDetails findById(Integer id);
	List<OrderDetails> findAll();
	OrderDetails create(OrderDetails entity);
	void update(OrderDetails entity);
	OrderDetails delete(Integer id);
}
