/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiglesiasp.javamodc4.springmysql.clinica.dao.IRoleDAO;
import com.aiglesiasp.javamodc4.springmysql.clinica.dto.Role;

/**
 * @author aitor
 *
 */
@Service
public class RoleServiceImpl implements IRoleService {

	@Autowired
	IRoleDAO iRoleDAO;

	@Override
	public List<Role> listarRole() {
		return iRoleDAO.findAll();
	}

	@Override
	public Role guardarRole(Role role) {
		return iRoleDAO.save(role);
	}

	@Override
	public Role roleById(int id) {
		return iRoleDAO.findById(id).get();
	}

	@Override
	public Role actualizarRole(Role role) {
		return iRoleDAO.save(role);
	}

	@Override
	public void eliminarRole(int id) {
		iRoleDAO.deleteById(id);

	}

}
