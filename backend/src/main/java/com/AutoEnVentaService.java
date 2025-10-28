package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // Marca esta clase como un componente de servicio gestionado por Spring
public class AutoEnVentaService {

    // Inyección del Repositorio para acceder a los datos de la BD
    @Autowired
    private AutoEnVentaRepository autoEnVentaRepository;

    /**
     * Recupera todos los vehículos disponibles en el inventario.
     * @return Una lista de objetos AutoEnVenta.
     */
    public List<AutoenVenta> listarTodos() {
        // Usa el método findAll() heredado del JpaRepository
        return autoEnVentaRepository.findAll();
    }
    
    // Aquí podrías añadir lógica adicional, como buscar por marca o modelo.
}
