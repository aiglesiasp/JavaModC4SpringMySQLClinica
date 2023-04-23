/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.clinica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.javamodc4.springmysql.clinica.dto.Role;

/**
 * @author aitor
 *
 */
public interface IRoleDAO extends JpaRepository<Role, Integer> {

}
