package br.dev.andresimoes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.andresimoes.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
