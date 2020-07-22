package com.example.demo.model.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_Reboque")
public class Reboque {
	@Id
	@GeneratedValue
	private Long id;
	private String empresa;
	/*
	@ManyToMany(mappedBy = "reboque")
	private List <Veiculo> veiculo;
	*/
	@OneToOne
	@JoinColumn(name = "ID_Placa")
	private Placa placa;
	
	
	@OneToOne(mappedBy="reboque")
	private Locadora locadora;
	

	public Locadora getLocadora() {
		return locadora;
	}
	public void setLocadora(Locadora locadora) {
		this.locadora = locadora;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	/*
	 * public List<Veiculo> getVeiculo() { return veiculo; }
	 * 
	 * public void setVeiculo(List<Veiculo> veiculo) { this.veiculo = veiculo; }
	 */

	public Placa getPlaca() {
		return placa;
	}

	public void setPlaca(Placa placa) {
		this.placa = placa;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reboque other = (Reboque) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
