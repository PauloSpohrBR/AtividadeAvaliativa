package com.br.atividade_avaliativa.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.atividade_avaliativa.Entities.Produto;
import com.br.atividade_avaliativa.Repositories.ProdutoRepository;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping("/cadastrarProduto")
    public void cadastrarProduto(@RequestBody List<Produto> produto) {
        produtoRepository.saveAll(produto);
    }

    @GetMapping("/buscarProduto")
    public List<Produto> buscarProduto() {
        return produtoRepository.findAll();
    }
}
