package com;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.servicios.servicioPoliza;

import lombok.RequiredArgsConstructor;
import mx.bigdata.sat.ce_polizas_periodo.schema.Polizas;

@RestController 
@RequestMapping("/polizas")
@RequiredArgsConstructor
public class controladorPoliza {

    private final servicioPoliza servicioPoliza;
    
    @PostMapping
    public ResponseEntity guardarPoliza(@RequestBody Polizas polizas){

        return new ResponseEntity(servicioPoliza.guardarPoliza(polizas),HttpStatus.CREATED);
    }

    @GetMapping("/{numeroPoliza}")
    public ResponseEntity obtenerPoliza(@PathVariable("") Long numeroPoliza){

        return new ResponseEntity(servicioPoliza.obtenerPolizas(numeroPoliza),HttpStatus.OK);
    }


    @PutMapping("/{numeroPoliza}")
    public ResponseEntity modificarPoliza(@PathVariable("") Long numeroPoliza, @RequestBody Polizas polizas){

        return new ResponseEntity(servicioPoliza.polizasAModificar(numeroPoliza, polizas),HttpStatus.OK);

    }

    @DeleteMapping("/{numeroPoliza}")
    public ResponseEntity eliminarPolizas(@PathVariable("") Long numeroPoliza){

        boolean respuesta = servicioPoliza.eliminarPolizas(numeroPoliza);
        if(respuesta==true){
            return new ResponseEntity(HttpStatus.OK);

        }
        else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
