package com.example.SistemaAdministracion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SistemaAdministracion.entities.Descuento;

public interface DescuentoRepository extends JpaRepository<Descuento, Integer> {

}
