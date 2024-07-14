package com.aluradesafios.literatura.repository;

import com.aluradesafios.literatura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    //buscar autor entre su fecha de nacimiento y fecha de defuncion
    List<Autor> findByFechaNacimientoLessThanEqualAndFechaDefuncionGreaterThanEqual(Integer A1, Integer A2);
    //buscar autor por fecha de nacimiento
    Optional<Autor> findByNombreAndFechaNacimiento(String nombre, Integer nac);
}
