package com.es.ecsistdig.cibertec.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CATEGORIES")
public class Categories implements Serializable{
	
	private static final long serialVersionUID = -8774982601709259536L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CAT_ID")
	private Integer catId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "FEC_NAC")
	private Date fecNac;
	
	@Column(name = "SIZE")
	private String size;
	
	@Column(name = "WEIGHT")
	private String weight;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "STATUS")
	private Boolean status;
	
	@Column(name = "ID_TYPE_USER")
	private Integer idTypeUser;
	
	
	public Categories(Integer catId, String name, String lastName, Date fecNac, String size, String weight,
			String email, String password, Boolean status, Integer idTypeUser) {
		this.catId = catId;
		this.name = name;
		this.lastName = lastName;
		this.fecNac = fecNac;
		this.size = size;
		this.weight = weight;
		this.email = email;
		this.password = password;
		this.status = status;
		this.idTypeUser = idTypeUser;
	}
	
	public Categories() {
		
	}
	
	/* Crear Persona */
	public static Categories creationCategories(Integer catId, String name, String lastName, Date fecNac, String size, String weight,
			String email, String password, Boolean status, Integer idTypeUser) {
		return new Categories (null, name, lastName, fecNac, size, weight, email, password, status, idTypeUser);		
	}


	public Integer getCatId() {
		return catId;
	}


	public void setCatId(Integer catId) {
		this.catId = catId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getFecNac() {
		return fecNac;
	}


	public void setFecNac(Date fecNac) {
		this.fecNac = fecNac;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	public Integer getIdTypeUser() {
		return idTypeUser;
	}


	public void setIdTypeUser(Integer idTypeUser) {
		this.idTypeUser = idTypeUser;
	}
	
	
	

}
