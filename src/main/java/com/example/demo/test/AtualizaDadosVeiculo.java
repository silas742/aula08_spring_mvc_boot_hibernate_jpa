package com.example.demo.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.demo.model.bean.Veiculo;
import com.example.demo.model.repository.JPAutil;

public class AtualizaDadosVeiculo {
	public static void main(String[] args) {
		
		EntityManager manager = JPAutil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Veiculo V = manager.find(Veiculo.class,1L);
		V.setMarca(V.getMarca()+"Volks");
		V.setAno("2019");
		transaction.commit();
		
		manager.close();
		JPAutil.close();
	}
}
