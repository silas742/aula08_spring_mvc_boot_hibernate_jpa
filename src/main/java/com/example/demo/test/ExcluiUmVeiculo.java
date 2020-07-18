package com.example.demo.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.demo.model.bean.Veiculo;
import com.example.demo.model.repository.JPAutil;

public class ExcluiUmVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAutil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Veiculo v = manager.find(Veiculo.class , 1L);
		manager.remove(v);
		
		transaction.commit();
		
		
		
		manager.close();
		JPAutil.close();
	}

}
