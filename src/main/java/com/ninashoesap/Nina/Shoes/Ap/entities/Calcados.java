package com.ninashoesap.Nina.Shoes.Ap.entities;

import java.io.Serializable;
import java.util.Objects;

import com.ninashoesap.Nina.Shoes.Ap.entities.enums.TipoCalcado;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_calcados")
public class Calcados implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeSapato;
	private TipoCalcado tipoCalcado;
	private Integer qtd33;
	/*private Integer qtd34;
	private Integer qtd35;
	private Integer qtd36;
	private Integer qtd37;
	private Integer qtd38;
	private Integer qtd39;
	private Integer qtd40;*/

	//Getter and Setters
	
	public Long getId() {
		return id;
	}

	public String getNomeSapato() {
		return nomeSapato;
	}
	public void setNomeSapato(String nomeSapato) {
		this.nomeSapato = nomeSapato;
	}
	
	public TipoCalcado getTipoCalcado() {
		return tipoCalcado;
	}

	public void setTipoCalcado(TipoCalcado tipoCalcado) {
		this.tipoCalcado = tipoCalcado;
	}

	public void setQtd33(Integer qtd33) {
		this.qtd33 = qtd33;
	}

	public Integer getQtd33() {
		return qtd33;
		
	}
	/*public void setQtd33(Integer qtd33) {
		this.qtd33 = qtd33;
	}
	public Integer getQtd34() {
		return qtd34;
	}
	public void setQtd34(Integer qtd34) {
		this.qtd34 = qtd34;
	}
	public Integer getQtd35() {
		return qtd35;
	}
	public void setQtd35(Integer qtd35) {
		this.qtd35 = qtd35;
	}
	public Integer getQtd36() {
		return qtd36;
	}
	public void setQtd36(Integer qtd36) {
		this.qtd36 = qtd36;
	}
	public Integer getQtd37() {
		return qtd37;
	}
	public void setQtd37(Integer qtd37) {
		this.qtd37 = qtd37;
	}
	public Integer getQtd38() {
		return qtd38;
	}
	public void setQtd38(Integer qtd38) {
		this.qtd38 = qtd38;
	}
	public Integer getQtd39() {
		return qtd39;
	}
	public void setQtd39(Integer qtd39) {
		this.qtd39 = qtd39;
	}
	public Integer getQtd40() {
		return qtd40;
	}
	public void setQtd40(Integer qtd40) {
		this.qtd40 = qtd40;
	}*/

	//Constructor
	
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	public Calcados() {
		
	}
	
	public Calcados(Long id, String nomeSapato, TipoCalcado tipoCalcado, Integer qtd33) {
		super();
		this.id = id;
		this.nomeSapato = nomeSapato;
		this.tipoCalcado = tipoCalcado;
		this.qtd33 = qtd33;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calcados other = (Calcados) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
