package com.centurion.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.centurion.entity.Orders;

@Transactional
public class OrdersDAOImpl implements OrdersDAO {

	@Autowired
	SessionFactory factory;
	
	@Override
	public Orders findById(Integer id) {
		Session session = factory.getCurrentSession();
		Orders entity = session.find(Orders.class, id);
		return entity;
	}

	@Override
	public List<Orders> findAll() {
		String hql = "FROM Orders";
		Session session = factory.getCurrentSession();
		TypedQuery<Orders> query = session.createQuery(hql,Orders.class);
		List<Orders> list = query.getResultList();
		
		return list;
	}

	@Override
	public Orders create(Orders entity) {
		Session session = factory.getCurrentSession();
		session.save(entity);
		return entity;
	}

	@Override
	public void update(Orders entity) {
		Session session = factory.getCurrentSession();
		session.update(entity);
	}

	@Override
	public Orders delete(Integer id) {
		Session session = factory.getCurrentSession();
		Orders entity = session.find(Orders.class, id);
		session.delete(entity);
		return entity;
	}

}
