/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.clinica.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author aitor
 *
 */
@Entity
@Table(name = "usuarios")
public class Usuario {
	// Atributos de entidad departamento
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;

	@OneToMany
	@JoinColumn(name = "cita")
	private List<Cita> cita;
	
	@ManyToOne
	@JoinColumn(name = "role")
	private Role role;

	// CONSTRUCTORES
	public Usuario() {

	}

	public Usuario(String name, String email, Role role) {
		this.name = name;
		this.role = role;
		this.email = email;
	}

	// GETTERS Y SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void setCita(List<Cita> cita) {
		this.cita = cita;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Citas")
	public List<Cita> getCita() {
		return cita;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", name=" + name + ", email=" + email + ", cita=" + cita + ", role=" + role + "]";
	}

	

}
