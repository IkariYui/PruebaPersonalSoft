package com.servicios;

import java.util.Optional;

import mx.bigdata.sat.ce_polizas_periodo.schema.Polizas;

public interface servicioPoliza {
    Polizas guardarPoliza(Polizas polizas);
    Optional<Polizas>obtenerPolizas(Long numeroPoliza);

    Polizas polizasAModificar(Long numeroPoliza, Polizas polizasAModificar);

    boolean eliminarPolizas(Long numeroPoliza);

    
}
