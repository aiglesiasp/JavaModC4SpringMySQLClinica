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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author aitor
 *
 */
@Entity
@Table(name = "roles")
public class Role {
	// Atributos de entidad departamento
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "usuario")
	private List<Usuario> usuario;

	// CONSTRUCTORES
	public Role() {

	}

	public Role(String nombre) {
		this.nombre = nombre;
	}

	// GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Usuarios")
	public List<Usuario> getUsuario() {
		return usuario;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", nombre=" + nombre + ", usuario=" + usuario + "]";
	}

	

}
