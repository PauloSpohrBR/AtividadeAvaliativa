package com.br.atividade_avaliativa.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.atividade_avaliativa.Entities.Pessoa;
import com.br.atividade_avaliativa.Repositories.PessoaRepository;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    PessoaRepository pessoaRepository;

    @PostMapping("/cadastrarPessoa")
    public void cadastrarPessoa(@RequestBody List<Pessoa> pessoa) {
        pessoaRepository.saveAll(pessoa);
    }

    @GetMapping("/buscarPessoa")
    public List<Pessoa> buscarPessoa() {
        return pessoaRepository.findAll();
    }
}
