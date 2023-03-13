package com.revature.games.controller;

import com.revature.games.entity.Game;
import com.revature.games.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") // origins = "http://localhost:3000"
@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    GameService gameService;

    @PostMapping()
    public Game insert(@RequestBody Game game) {
        return gameService.insert(game);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Game> getAll() {
        return gameService.getAll();
    }

    @GetMapping("/{gameId}")
    public Game getById(@PathVariable("gameId") Long id) {
        return gameService.getById(id);
    }

    @PutMapping()
    public Game update(@RequestBody Game game) {
        return gameService.update(game);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return gameService.delete(id);
    }


}
