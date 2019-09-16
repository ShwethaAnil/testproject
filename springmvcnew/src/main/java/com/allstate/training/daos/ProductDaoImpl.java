package com.allstate.training.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.allstate.training.entites.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	SessionFactory sessionFactory;

	public void addProduct(Product p) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		session.close();
	}

	public void updateProductCost(int cost, int pid) {
		// TODO Auto-generated method stub

	}

	public void updateProduct(Product p) {
		// TODO Auto-generated method stub

	}

	public void deletProduct(int pid) {
		// TODO Auto-generated method stub

	}

	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getProducts() {
		Session session=sessionFactory.openSession();
		List<Product> products=session.createCriteria(Product.class).list();
		return products;
	}

	public List<Product> getProductsByBrand(String brand) {
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(Product.class);
		cr.add(Restrictions.eq("brand", brand));
		List<Product> products=cr.list();
		return products;
	}

}
