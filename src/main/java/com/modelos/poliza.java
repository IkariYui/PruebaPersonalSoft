package com.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class poliza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroPoliza;
    private String coberturasPoliza;
    private String valorPoliza;
    private String nombrePoliza;
    private String fechaInicioPoliza;
    private String nombreCliente;
    private String fechaNacimientoCliente;
    private String ciudadResidenciaCliente;
    private String direccionResidenciaCliente;
    private String placaAutomotor;
    private String modeloAutomotor;
    private boolean inspeccion;
    
}
