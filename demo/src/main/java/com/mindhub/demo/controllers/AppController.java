package com.mindhub.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class AppController {

    @GetMapping("/{mensaje}")
    public ResponseEntity<String> getMensaje(@PathVariable(name = "mensaje") String mensaje) {
        return ResponseEntity.ok("Se obtiene el mensaje: " + mensaje);
    }
    @PutMapping("/{mensaje}")
    public ResponseEntity<String> putMensaje(@PathVariable(name = "mensaje") String mensaje) {
        return ResponseEntity.ok("Se edita el mensaje: " + mensaje);
    }
    @PostMapping("/{mensaje}")
    public ResponseEntity<String> postMensaje(@PathVariable(name = "mensaje") String mensaje) {
        return ResponseEntity.ok("Se guarda el mensaje: " + mensaje);
    }
    @DeleteMapping("/{mensaje}")
    public ResponseEntity<String> DeleteMensaje(@PathVariable(name = "mensaje") String mensaje) {
        return ResponseEntity.ok("Se elimina el mensaje: " + mensaje);
    }
}