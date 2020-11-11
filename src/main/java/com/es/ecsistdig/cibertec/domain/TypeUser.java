package com.es.ecsistdig.cibertec.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_TYPE_USER")
public class TypeUser implements Serializable{
	
	private static final long serialVersionUID = -5084297198993031200L;

	@Id
	@Column(name = "ID_TYPE_USER")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTypeUser;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "STATUS")
	private Boolean status;

	public TypeUser(Integer idTypeUser, String description, Boolean status) {
		this.idTypeUser = idTypeUser;
		this.description = description;
		this.status = status;
	}
	
	public TypeUser() {
		
	}

	public Integer getIdTypeUser() {
		return idTypeUser;
	}

	public void setIdTypeUser(Integer idTypeUser) {
		this.idTypeUser = idTypeUser;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
}
