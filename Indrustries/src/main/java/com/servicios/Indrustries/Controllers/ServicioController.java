package com.servicios.Indrustries.Controllers;


import com.servicios.Indrustries.Models.Servicio;
import com.servicios.Indrustries.Repositories.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicios")
public class ServicioController {
    @Autowired
    private ServicioRepository servicioRepository;

    @GetMapping
    public List<Servicio> listarServicios() {
        return servicioRepository.findAll();
    }

    @PostMapping
    public Servicio guardarServicio(@RequestBody Servicio servicio) {
        return servicioRepository.save(servicio);
    }
}
