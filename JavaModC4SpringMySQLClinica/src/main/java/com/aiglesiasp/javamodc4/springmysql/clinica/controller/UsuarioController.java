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

import com.aiglesiasp.javamodc4.springmysql.clinica.dto.Usuario;
import com.aiglesiasp.javamodc4.springmysql.clinica.service.UsuarioServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	UsuarioServiceImpl proveedorServiceImpl;

	@GetMapping("/usuarios")
	public List<Usuario> listarUsuario() {
		return proveedorServiceImpl.listarUsuario();
	}

	@PostMapping("/usuarios")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		return proveedorServiceImpl.guardarUsuario(usuario);
	}

	@GetMapping("/usuarios/{id}")
	public Usuario usuarioById(@PathVariable(name = "id") int id) {
		Usuario usuario = new Usuario();
		usuario = proveedorServiceImpl.usuarioById(id);
		return usuario;
	}

	@PutMapping("/usuarios/{id}")
	public Usuario actualizarUsuario(@PathVariable(name = "id") int id, @RequestBody Usuario usuario) {

		Usuario usuario_seleccionado = new Usuario();
		Usuario usuario_actualizado = new Usuario();
		usuario_seleccionado = proveedorServiceImpl.usuarioById(id);
		usuario_seleccionado.setId(id);
		usuario_seleccionado.setCita(usuario.getCita());
		usuario_seleccionado.setEmail(usuario.getEmail());
		usuario_seleccionado.setName(usuario.getName());
		usuario_seleccionado.setRole(usuario.getRole());

		usuario_actualizado = proveedorServiceImpl.actualizarUsuario(usuario_seleccionado);
		return usuario_actualizado;
	}

	@DeleteMapping("/usuarios/{id}")
	public void eliminarUsuario(@PathVariable(name = "id") int id) {
		proveedorServiceImpl.eliminarUsuario(id);
	}

}
