package com.example.demo.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.demo.model.bean.Placa;
import com.example.demo.model.bean.Veiculo;
import com.example.demo.model.repository.JPAutil;

public class InserePlaca {

	public static void main(String[] args) {
		
		EntityManager manager = JPAutil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
	
		transaction.begin();
		
		Placa p = new Placa();
		p.setCidade("Santos");
		manager.persist(p);
		
		Veiculo v = new Veiculo();
		v.setMarca("palio");
		v.setAno("2020");
		v.setCor("Azul");
		v.setModelo("Aleatorio");
		v.setPlaca(p);
		manager.persist(v);
		
		transaction.commit();
		manager.close();
		JPAutil.close();
	}
}
