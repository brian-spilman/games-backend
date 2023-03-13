package com.revature.games.service;

import com.revature.games.entity.Game;

import java.util.List;

public interface GameService {
    Game insert(Game game);
    Game getById(Long id);
    List<Game> getAll();
    Game update(Game game);
    boolean delete(Long id);

}
