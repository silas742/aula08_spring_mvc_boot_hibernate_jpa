package com.example.demo.model.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAutil {

	private static EntityManagerFactory factory;
	static {factory = Persistence.createEntityManagerFactory("silasPU");}
	public static EntityManager getEntityManager () {
		return factory.createEntityManager();
	}
	public static void close() {
		factory.close();
	}
}
