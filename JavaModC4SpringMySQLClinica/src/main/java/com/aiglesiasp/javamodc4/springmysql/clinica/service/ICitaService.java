/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.clinica.service;

import java.util.List;

import com.aiglesiasp.javamodc4.springmysql.clinica.dto.Cita;

/**
 * @author aitor
 *
 */
public interface ICitaService {
	// Metodos del CRUD
	public List<Cita> listarCita();

	public Cita guardarCita(Cita cita);

	public Cita citaById(int id);

	public Cita actualizarCita(Cita cita);

	public void eliminarCita(int id);

}
