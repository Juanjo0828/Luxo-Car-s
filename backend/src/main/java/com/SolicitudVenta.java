package com;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "SOLICITUDES_VENTA") // Mapea la tabla del formulario de vender.html
public class SolicitudVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSolicitud;

    @Column(name = "nombre_completo", nullable = false, length = 100)
    private String nombreCompleto;

    @Column(name = "correo_electronico", nullable = false, unique = true, length = 150)
    private String correoElectronico;

    @Column(name = "telefono", length = 15)
    private String telefono;

    @Column(name = "marca_auto", nullable = false, length = 50)
    private String marcaAuto;

    @Column(name = "modelo_auto", nullable = false, length = 100)
    private String modeloAuto;

    @Column(name = "anio_auto", nullable = false)
    private Short anioAuto;

    @Column(name = "precio_estimado", precision = 15, scale = 2)
    private BigDecimal precioEstimado;

    @Column(name = "descripcion_auto", columnDefinition = "TEXT")
    private String descripcionAuto;

    @Column(name = "fecha_solicitud")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitud;

    @Column(name = "estado_solicitud", length = 30)
    private String estadoSolicitud;

    // Constructor vacío requerido por JPA
    public SolicitudVenta() {
    }

    // ¡IMPORTANTE! Añade los Getters y Setters aquí (no mostrados por brevedad)
    // ...
}
