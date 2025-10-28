package com;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class SolicitudVentaService {
    @Autowired
    private SolicitudVentaRepository solicitudVentaRepository;

    /**
     * @param solicitud 
     * @return 
     */
    public SolicitudVenta guardarSolicitud(SolicitudVenta solicitud) {
        return solicitudVentaRepository.save(solicitud);
    }
}
