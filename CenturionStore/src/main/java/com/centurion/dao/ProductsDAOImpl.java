package com.centurion.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.centurion.entity.Products;

@Transactional
public class ProductsDAOImpl implements ProductsDAO {

	@Autowired
	SessionFactory factory;
	
	@Override
	public Products findById(Integer id) {
		Session session = factory.getCurrentSession();
		Products entity = session.find(Products.class, id);
		return entity;
	}

	@Override
	public List<Products> findAll() {
		String hql = "FROM Products";
		Session session = factory.getCurrentSession();
		TypedQuery<Products> query = session.createQuery(hql,Products.class);
		List<Products> list = query.getResultList();
		
		return list;
	}

	@Override
	public Products create(Products entity) {
		Session session = factory.getCurrentSession();
		session.save(entity);
		return entity;
	}

	@Override
	public void update(Products entity) {
		Session session = factory.getCurrentSession();
		session.update(entity);
	}

	@Override
	public Products delete(Integer id) {
		Session session = factory.getCurrentSession();
		Products entity = session.find(Products.class, id);
		session.delete(entity);
		return entity;
	}

}
