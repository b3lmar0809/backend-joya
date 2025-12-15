package com.example.joyeria_back.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id")
    private Usuario usuario;

    @Column(name = "fechaVenta")
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "id")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "id")
    private MetodoPago metodoPago;

    @ManyToOne
    @JoinColumn(name = "id")
    private MetodoEnvio metodoEnvio;

    @Column(name = "totalVenta")
    private Double total;

    @OneToMany(mappedBy = "detalleVenta")
    private List<DetalleVenta> detalleVentas;
}
