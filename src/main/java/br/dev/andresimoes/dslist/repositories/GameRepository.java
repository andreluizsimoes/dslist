package br.dev.andresimoes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.andresimoes.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
