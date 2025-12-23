package com.example.joyeria_back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.joyeria_back.model.Categoria;
import com.example.joyeria_back.model.Genero;
import com.example.joyeria_back.model.Marca;
import com.example.joyeria_back.model.Material;
import com.example.joyeria_back.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    List<Producto> findByCategoria(Categoria categoria);

    List<Producto> findByMaterial(Material material);

    List<Producto> findByGenero(Genero genero);

    List<Producto> findByMarca(Marca marca);
    
    List<Producto> findByPrecio(Double min, Double max);

    List<Producto> findByNombre(String nombre);
}