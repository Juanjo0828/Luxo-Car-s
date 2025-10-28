package com;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "AUTOS_EN_VENTA") 
public class AutoenVenta { 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuto;

    @Column(name = "marca", nullable = false, length = 50)
    private String marca;

    @Column(name = "modelo", nullable = false, length = 100)
    private String modelo;

    @Column(name = "anio", nullable = false)
    private Short anio; 

    @Column(name = "precio_cop", nullable = false, precision = 15, scale = 2)
    private BigDecimal precioCop;

    @Column(name = "kilometraje")
    private Integer kilometraje;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "imagen_ruta", length = 255)
    private String imagenRuta;

    @Column(name = "fecha_publicacion")
    @Temporal(TemporalType.DATE)
    private Date fechaPublicacion;

    @Column(name = "garantia_extendida")
    private Boolean garantiaExtendida;
    public AutoenVenta() {
    }

    
}