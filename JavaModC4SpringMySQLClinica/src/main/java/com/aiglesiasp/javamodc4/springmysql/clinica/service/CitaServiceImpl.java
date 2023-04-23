/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiglesiasp.javamodc4.springmysql.clinica.dao.ICitaDAO;
import com.aiglesiasp.javamodc4.springmysql.clinica.dto.Cita;

/**
 * @author aitor
 *
 */
@Service
public class CitaServiceImpl implements ICitaService {
	@Autowired
	ICitaDAO iCitaDAO;

	@Override
	public List<Cita> listarCita() {
		return iCitaDAO.findAll();
	}

	@Override
	public Cita guardarCita(Cita cita) {
		return iCitaDAO.save(cita);
	}

	@Override
	public Cita citaById(int id) {
		return iCitaDAO.findById(id).get();
	}

	@Override
	public Cita actualizarCita(Cita cita) {
		return iCitaDAO.save(cita);
	}

	@Override
	public void eliminarCita(int id) {
		iCitaDAO.deleteById(id);

	}

}
