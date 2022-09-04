package com.centurion.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.centurion.entity.OrderDetails;

@Transactional
public class OrderDetailsDAOImpl implements OrderDetailsDAO {

	@Autowired
	SessionFactory factory;
	
	@Override
	public OrderDetails findById(Integer id) {
		Session session = factory.getCurrentSession();
		OrderDetails entity = session.find(OrderDetails.class, id);
		return entity;
	}

	@Override
	public List<OrderDetails> findAll() {
		String hql = "FROM OrderDetails";
		Session session = factory.getCurrentSession();
		TypedQuery<OrderDetails> query = session.createQuery(hql,OrderDetails.class);
		List<OrderDetails> list = query.getResultList();
		
		return list;
	}

	@Override
	public OrderDetails create(OrderDetails entity) {
		Session session = factory.getCurrentSession();
		session.save(entity);
		return entity;
	}

	@Override
	public void update(OrderDetails entity) {
		Session session = factory.getCurrentSession();
		session.update(entity);
	}

	@Override
	public OrderDetails delete(Integer id) {
		Session session = factory.getCurrentSession();
		OrderDetails entity = session.find(OrderDetails.class, id);
		session.delete(entity);
		return entity;
	}

}
