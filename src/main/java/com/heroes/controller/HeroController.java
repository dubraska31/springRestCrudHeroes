package com.heroes.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.heroes.model.Hero;
import com.heroes.service.HeroService;

@RestController
public class HeroController {

	@Autowired
	HeroService heroService;

	@GetMapping("/heroes")
	public ArrayList<Hero> getHeroes() {
		return heroService.getHeroes();
	}

	@GetMapping("/heroes/{id}")
	public Hero getHeroById(@PathVariable int id) {
		return heroService.getHeroById(id);
	}

	@PostMapping("/heroes")
	public Hero createHero(@RequestBody Hero hero) {
		return heroService.createHero(hero);
	}

	@PutMapping("/heroes")
	public Hero updateHero(@RequestBody Hero newHero) {
		return heroService.updateHero(newHero);
	}

	@DeleteMapping("/heroes/{id}")
	public void deleteHero(@PathVariable int id) {
		heroService.deleteHero(id);
	}
}
