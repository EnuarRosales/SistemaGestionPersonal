package com.example.SistemaAdministracion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SistemaAdministracion.entities.Room;

public interface RoomRepository extends JpaRepository<Room, Integer> {

}
