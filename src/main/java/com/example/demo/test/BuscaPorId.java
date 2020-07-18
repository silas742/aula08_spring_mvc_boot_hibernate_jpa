package com.example.demo.test;

import javax.persistence.EntityManager;

import com.example.demo.model.bean.Veiculo;
import com.example.demo.model.repository.JPAutil;

public class BuscaPorId {

	public static void main(String[] args) {
		EntityManager manager =JPAutil.getEntityManager();
		Veiculo v = manager.find(Veiculo.class,1L);
		System.out.println(v);
		manager.close();
		JPAutil.close();				
	}
}
