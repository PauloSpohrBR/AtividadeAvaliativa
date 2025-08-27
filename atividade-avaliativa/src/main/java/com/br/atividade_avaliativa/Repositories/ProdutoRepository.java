package com.br.atividade_avaliativa.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.br.atividade_avaliativa.Entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
