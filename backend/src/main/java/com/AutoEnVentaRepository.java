package com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoEnVentaRepository extends JpaRepository<AutoenVenta, Long> {
}
