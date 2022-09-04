package com.centurion.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.centurion.entity.Customers;

@Transactional
public class CustomersDAOImpl implements CustomersDAO {

	@Autowired
	SessionFactory factory;
	
	@Override
	public Customers findById(Integer id) {
		Session session = factory.getCurrentSession();
		Customers entity = session.find(Customers.class, id);
		return entity;
	}

	@Override
	public List<Customers> findAll() {
		String hql = "FROM Customers";
		Session session = factory.getCurrentSession();
		TypedQuery<Customers> query = session.createQuery(hql,Customers.class);
		List<Customers> list = query.getResultList();
		
		return list;
	}

	@Override
	public Customers create(Customers entity) {
		Session session = factory.getCurrentSession();
		session.save(entity);
		return entity;
	}

	@Override
	public void update(Customers entity) {
		Session session = factory.getCurrentSession();
		session.update(entity);
	}

	@Override
	public Customers delete(Integer id) {
		Session session = factory.getCurrentSession();
		Customers entity = session.find(Customers.class, id);
		session.delete(entity);
		return entity;
	}

}
