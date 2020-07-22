package com.example.demo.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.demo.model.bean.Pessoa;
import com.example.demo.model.bean.Placa;
import com.example.demo.model.bean.Veiculo;
import com.example.demo.model.repository.JPAutil;



public class TesteInsereUmaPessoa {

	public static void main(String[] args) {
		
		EntityManager manager = JPAutil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		List<Veiculo>veiculos = new ArrayList<>();
		
		Placa placa = new Placa();
		placa.setCidade("Sao Paulo");
		
		manager.persist(placa);
		Veiculo v = new Veiculo();
		
		v.setModelo("Sedan");
		v.setMarca("aleatorio");
		v.setCor("Azul");
		v.setAno("2017");
		v.setPlaca(placa);
		manager.persist(v);
		
		Pessoa p = new Pessoa ();
		p.setNome("Silas");
		p.setIdade(20);
		p.setRg ("54844952-3");
		p.setVeiculo(veiculos);
		manager.persist(p);
		
		
		transaction.commit();
		manager.close();
		JPAutil.close();
		
		
	}
}
