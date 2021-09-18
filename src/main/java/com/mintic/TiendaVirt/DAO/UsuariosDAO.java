package com.mintic.TiendaVirt.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mintic.TiendaVirt.modelo.Usuarios;

public interface UsuariosDAO extends JpaRepository<Usuarios, Integer> {

}