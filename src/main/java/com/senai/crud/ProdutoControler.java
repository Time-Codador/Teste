package com.senai.crud;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoControler {

    List<Produtos> ps = new ArrayList<>();

    @PostMapping
    public ResponseEntity<?> salvarProduto(@RequestBody Produtos produtoDs) {
        ps.add(produtoDs);
        System.out.println("Dispositivo móvel enviou: " + produtoDs.nome());

        return ResponseEntity.status(HttpStatus.CREATED).body(ps);
    }


}

