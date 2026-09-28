package br.com.leonardo.teste.repository;

import br.com.leonardo.teste.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository< Produto, Long> {
}
