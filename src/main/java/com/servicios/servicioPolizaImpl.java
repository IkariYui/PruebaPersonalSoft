package com.servicios;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.repositorioPoliza;

import lombok.AllArgsConstructor;
import mx.bigdata.sat.ce_polizas_periodo.schema.Polizas;

@Service
@AllArgsConstructor
public class servicioPolizaImpl implements servicioPoliza {

    private final repositorioPoliza repositorioPoliza;

    @Override
    public Polizas guardarPoliza(Polizas polizas) {
        // TODO Auto-generated method stub
        return (Polizas) repositorioPoliza.save(polizas);
    }

    @Override
    public Optional<Polizas> obtenerPolizas(Long numeroPoliza) {
        // TODO Auto-generated method stub
        return repositorioPoliza.findById(numeroPoliza);
    }

    @Override
    public Polizas polizasAModificar(Long numeroPoliza, Polizas polizas) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean eliminarPolizas(Long numeroPoliza) {
        // TODO Auto-generated method stub
        try{
            repositorioPoliza.deleteById(numeroPoliza);
            return true;
        }
        catch (Exception e){
            return false;

        }
    }
    
}
