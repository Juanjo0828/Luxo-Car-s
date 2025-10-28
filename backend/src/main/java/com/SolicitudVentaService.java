package com;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Marca esta clase como un componente de servicio de Spring
public class SolicitudVentaService {

    // Inyección de dependencia del Repositorio para acceder a la base de datos
    @Autowired
    private SolicitudVentaRepository solicitudVentaRepository;

    /**
     * Guarda la solicitud de venta recibida del formulario vender.html.
     * @param solicitud El objeto SolicitudVenta con los datos del cliente.
     * @return La solicitud guardada (incluyendo el ID generado por la BD).
     */
    public SolicitudVenta guardarSolicitud(SolicitudVenta solicitud) {
        // Usa el método save() del JpaRepository para guardar los datos.
        return solicitudVentaRepository.save(solicitud);
    }
}
