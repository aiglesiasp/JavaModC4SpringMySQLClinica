package com.aiglesiasp.javamodc4.springmysql.clinica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.javamodc4.springmysql.clinica.dto.Cita;

public interface ICitaDAO extends JpaRepository<Cita, Integer> {

}
