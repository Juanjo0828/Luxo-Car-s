package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service 
public class AutoEnVentaService {
    @Autowired
    private AutoEnVentaRepository autoEnVentaRepository;
    public List<AutoenVenta> listarTodos() {
        return autoEnVentaRepository.findAll();
    }
}
