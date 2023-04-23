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

import com.aiglesiasp.javamodc4.springmysql.clinica.dto.Role;
import com.aiglesiasp.javamodc4.springmysql.clinica.service.RoleServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class RoleController {

	@Autowired
	RoleServiceImpl roleServiceImpl;

	@GetMapping("/roles")
	public List<Role> listarRole() {
		return roleServiceImpl.listarRole();
	}

	@PostMapping("/roles")
	public Role guardarRole(@RequestBody Role role) {
		return roleServiceImpl.guardarRole(role);
	}

	@GetMapping("/roles/{id}")
	public Role roleById(@PathVariable(name = "id") int id) {
		Role role = new Role();
		role = roleServiceImpl.roleById(id);
		return role;
	}

	@PutMapping("/roles/{id}")
	public Role actualizarRole(@PathVariable(name = "id") int id, @RequestBody Role role) {

		Role role_seleccionado = new Role();
		Role role_actualizado = new Role();
		role_seleccionado = roleServiceImpl.roleById(id);
		role_seleccionado.setId(id);
		role_seleccionado.setNombre(role.getNombre());
		role_seleccionado.setUsuario(role.getUsuario());

		role_actualizado = roleServiceImpl.actualizarRole(role_seleccionado);

		return role_actualizado;
	}

	@DeleteMapping("/roles/{id}")
	public void eliminarRole(@PathVariable(name = "id") int id) {
		roleServiceImpl.eliminarRole(id);
	}

}
