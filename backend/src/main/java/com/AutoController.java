package com;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController 
@RequestMapping("/api/autos") 
@CrossOrigin(origins = "*") 
public class AutoController {
    @Autowired
    private AutoEnVentaService autoEnVentaService;

    @Autowired
    private SolicitudVentaService solicitudVentaService;
    @GetMapping
    public List<AutoenVenta> listarAutos() {
        return autoEnVentaService.listarTodos();
    }

    @PostMapping("/vender")
    public ResponseEntity<SolicitudVenta> recibirSolicitudVenta(@RequestBody SolicitudVenta solicitud) {
        SolicitudVenta nuevaSolicitud = solicitudVentaService.guardarSolicitud(solicitud);
        
        return ResponseEntity.ok(nuevaSolicitud);
    }
}
