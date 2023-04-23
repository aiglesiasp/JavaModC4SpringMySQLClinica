/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiglesiasp.javamodc4.springmysql.clinica.dto.Cita;
import com.aiglesiasp.javamodc4.springmysql.clinica.service.CitaServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class CitaController {

	@Autowired
	CitaServiceImpl citaServiceImpl;;

	@GetMapping("/citas")
	public List<Cita> listarCita() {
		return citaServiceImpl.listarCita();
	}

	@PostMapping("/citas")
	public Cita guardarCita(@RequestBody Cita cita) {
		return citaServiceImpl.guardarCita(cita);
	}

	@GetMapping("/citas/{id}")
	public Cita citaById(@PathVariable(name = "id") int id) {
		Cita cita = new Cita();
		cita = citaServiceImpl.citaById(id);
		return cita;
	}

	@PutMapping("/citas/{id}")
	public Cita actualizarCita(@PathVariable(name = "id") int id, @RequestBody Cita cita) {

		Cita cita_seleccionado = new Cita();
		Cita cita_actualizado = new Cita();
		cita_seleccionado = citaServiceImpl.citaById(id);
		cita_seleccionado.setId(id);
		cita_seleccionado.setFecha(cita.getFecha());
		cita_seleccionado.setUsuario(cita.getUsuario());

		cita_actualizado = citaServiceImpl.actualizarCita(cita_seleccionado);
		return cita_actualizado;
	}

	@DeleteMapping("/citas/{id}")
	public void eliminarCita(@PathVariable(name = "id") int id) {
		citaServiceImpl.eliminarCita(id);
	}

}
