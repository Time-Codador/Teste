package com.senai.crud;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoControler {

    @PostMapping
    public ResponseEntity<Produtos> salvarProduto(@RequestBody Produtos produtoDs) {

        System.out.println("Dispositivo móvel enviou: " + produtoDs.nome());

        return ResponseEntity.status(HttpStatus.CREATED).body(produtoDs);
    }
}
