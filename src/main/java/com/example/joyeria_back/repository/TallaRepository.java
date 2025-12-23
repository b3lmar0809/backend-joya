package com.example.joyeria_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.joyeria_back.model.Talla;

@Repository
public interface TallaRepository extends JpaRepository <Talla, Integer>{

}