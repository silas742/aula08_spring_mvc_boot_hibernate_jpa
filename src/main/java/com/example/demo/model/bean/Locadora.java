package com.example.demo.model.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_Locadora")
public class Locadora {

	@Id
	@GeneratedValue
	private Long id;
	private Date DataAluguel;
	
	@OneToOne
	private Veiculo veiculo;
	@OneToOne
	private Reboque reboque;
	
}
