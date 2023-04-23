/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.clinica.service;

import java.util.List;

import com.aiglesiasp.javamodc4.springmysql.clinica.dto.Usuario;

/**
 * @author aitor
 *
 */
public interface IUsuarioService {
	// Metodos del CRUD
	public List<Usuario> listarUsuario();

	public Usuario guardarUsuario(Usuario usuario);

	public Usuario usuarioById(int id);

	public Usuario actualizarUsuario(Usuario usuario);

	public void eliminarUsuario(int id);
}
