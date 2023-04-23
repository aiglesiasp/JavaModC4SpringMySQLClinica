/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.clinica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.javamodc4.springmysql.clinica.dto.Usuario;

/**
 * @author aitor
 *
 */
public interface IUsuarioDAO extends JpaRepository<Usuario, Integer> {

}
