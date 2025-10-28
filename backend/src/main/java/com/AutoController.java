package com;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Indica que esta clase manejará peticiones REST
@RequestMapping("/api/autos") // Define la URL base para todos los métodos
@CrossOrigin(origins = "*") // Crucial para permitir que tu frontend (HTML/JS) acceda a este backend
public class AutoController {

    // Inyección de los dos servicios que acabas de crear
    @Autowired
    private AutoEnVentaService autoEnVentaService;

    @Autowired
    private SolicitudVentaService solicitudVentaService;


    // 1. ENDPOINT: LISTAR TODOS LOS AUTOS (GET /api/autos)
    // Usado por comprar.html e index.html
    @GetMapping
    public List<AutoenVenta> listarAutos() {
        return autoEnVentaService.listarTodos();
    }


    // 2. ENDPOINT: PROCESAR FORMULARIO DE VENTA (POST /api/autos/vender)
    // Usado por vender.html
    @PostMapping("/vender")
    public ResponseEntity<SolicitudVenta> recibirSolicitudVenta(@RequestBody SolicitudVenta solicitud) {
        // Guarda el objeto SolicitudVenta en la base de datos a través del servicio
        SolicitudVenta nuevaSolicitud = solicitudVentaService.guardarSolicitud(solicitud);
        
        // Devuelve una respuesta 200 (OK) o 201 (Created) con el objeto guardado
        return ResponseEntity.ok(nuevaSolicitud);
    }

    /*
    // Si quisieras añadir la funcionalidad de buscar por ID:
    @GetMapping("/{id}")
    public ResponseEntity<AutoEnVenta> buscarAutoPorId(@PathVariable Long id) {
        // Lógica para buscar un auto específico
    }
    */
}
