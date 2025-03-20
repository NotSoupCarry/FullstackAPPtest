package com.example.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.models.Utente;

public interface UserRepository extends JpaRepository<Utente, Long> {

}
