package com.example.demo.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.example.demo.model.bean.Veiculo;
import com.example.demo.model.repository.JPAutil;

public class ListaTodos {

	public static void main(String[] args) {
		EntityManager manager =JPAutil.getEntityManager();
		Query query = manager.createQuery("from Usuario");
		List <Veiculo> veiculos = query.getResultList();
		for (Veiculo v: veiculos) {
			System.out.println(v);
			manager.close();
			JPAutil.close();
		}
	}

}
