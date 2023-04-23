/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.clinica.service;

import java.util.List;

import com.aiglesiasp.javamodc4.springmysql.clinica.dto.Role;

/**
 * @author aitor
 *
 */
public interface IRoleService {
	// Metodos del CRUD
	public List<Role> listarRole();

	public Role guardarRole(Role role);

	public Role roleById(int id);

	public Role actualizarRole(Role role);

	public void eliminarRole(int id);
}
