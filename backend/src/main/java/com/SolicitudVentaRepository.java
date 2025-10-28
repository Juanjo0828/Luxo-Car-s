package com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Indica que este es el componente que accede a los datos
public interface SolicitudVentaRepository extends JpaRepository<SolicitudVenta, Long> {
    
    // La interfaz hereda automáticamente métodos como save(), findAll(), findById(), etc.
    // Solo se necesita esta declaración para que Spring la use en SolicitudVentaService.
}
