package com.br.atividade_avaliativa.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.br.atividade_avaliativa.Entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
