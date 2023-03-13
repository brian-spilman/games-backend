package com.revature.games.service;

import com.revature.games.entity.Game;
import com.revature.games.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class GameServiceImpl implements GameService {

    @Autowired
    GameRepository gameRepository;

    @Override
    public Game insert(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public Game getById(Long id) {
        return gameRepository.findById(id).get();
    }

    @Override
    public List<Game> getAll() {
        return gameRepository.findAll();
    }

    @Override
    public Game update(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public boolean delete(Long id) {
        boolean found = gameRepository.existsById(id);
        // only try to delete the pet if id is found:
        if(found) { gameRepository.deleteById(id); }
        return found;
    }
}
