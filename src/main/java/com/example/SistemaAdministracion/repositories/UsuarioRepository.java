package com.example.SistemaAdministracion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SistemaAdministracion.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
