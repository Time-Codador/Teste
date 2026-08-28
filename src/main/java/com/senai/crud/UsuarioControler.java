package com.senai.crud;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioControler {

    List<Usuario> ps = new ArrayList<>();

    @PostMapping
    public ResponseEntity<?> salvarUsuario(@RequestBody Usuario usuarioDs) {
        ps.add(usuarioDs);
        System.out.println("Dispositivo móvel enviou: " + usuarioDs.nome());

        return ResponseEntity.status(HttpStatus.CREATED).body(ps);
    }


}

