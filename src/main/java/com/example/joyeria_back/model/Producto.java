package com.example.joyeria_back.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "producto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false, name = "nombreProducto", length = 40)
    private String nombre;

    @Column(nullable = false, length = 400)
    private String descripcion;

    @Column(nullable = false)
    private Double precio;

    @Column(nullable = true)
    private double descuento;

    @Column(nullable = false)
    private Integer stock;

    @Column(nullable = false, name = "imagenProducto")
    private String img;

    @ManyToOne
    @JoinColumn(name = "id")
    private Material material;

    @ManyToOne
    @JoinColumn(name = "id")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id")
    private Talla talla;

    @ManyToOne
    @JoinColumn(name = "id")
    private Marca marca;

    @ManyToOne 
    @JoinColumn(name = "id")
    private Genero genero;
}
