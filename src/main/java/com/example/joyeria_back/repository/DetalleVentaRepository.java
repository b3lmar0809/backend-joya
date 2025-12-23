package com.example.joyeria_back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.joyeria_back.model.DetalleVenta;
import com.example.joyeria_back.model.Venta;


@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Integer> {
    List<DetalleVenta> findByVenta(Venta venta);
}
