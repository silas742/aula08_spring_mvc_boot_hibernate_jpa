package com.example.demo.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.demo.model.bean.Veiculo;
import com.example.demo.model.repository.JPAutil;

public class InsereUmVeiculo {

	public static void main(String[] args) {
		
		EntityManager manager = JPAutil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();	
		//inicia o insert ao banco
		transaction.begin();
		//novo veiculo
		Veiculo v = new Veiculo();
		v.setAno("2018");
		v.setCor("Azul");
		v.setMarca("Sedan");
		v.setModelo("palio");
		//v.setPlaca("a2b215w");
		//salva no banco
		manager.persist(v);
		// manda para o banco
		transaction.commit();
		//Finaliza o banco
		manager.close();
		//finaliza o caminho ao sistema e ao banco
		JPAutil.close();
	}
}
