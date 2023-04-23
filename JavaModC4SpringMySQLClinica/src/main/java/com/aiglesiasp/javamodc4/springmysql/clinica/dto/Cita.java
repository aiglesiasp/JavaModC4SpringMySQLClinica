/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.clinica.dto;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author aitor
 *
 */
@Entity
@Table(name = "citas")
public class Cita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "fecha")
	private Date fecha;

	@ManyToOne
	@JoinColumn(name = "usuario")
	private Usuario usuario;

	// CONTRUCTORES
	public Cita() {

	}

	public Cita(Date fecha, Usuario usuario) {
		this.fecha = fecha;
		this.usuario = usuario;
	}

	// GETTERS Y SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Cita [id=" + id + ", fecha=" + fecha + ", usuario=" + usuario + "]";
	}

}
