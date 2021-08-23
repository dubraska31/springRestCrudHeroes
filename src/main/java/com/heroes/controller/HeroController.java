package com.heroes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.heroes.model.Hero;
import com.heroes.service.HeroService;

@RestController
public class HeroController {

	@Autowired
	HeroService heroService;

	@GetMapping("/hero")
	public List<Hero> getAllHeroes() {
		return heroService.getAllHeroes();
	}

	@GetMapping("/hero/{idHero}")
	public Hero getHeroById(@PathVariable long idHero) {
		return heroService.getHeroById(idHero);
	}

	@PostMapping("/hero")
	public Hero saveHero(@RequestBody Hero hero) {
		return heroService.saveHero(hero);
	}

	@PutMapping("/hero")
	public Hero updateHero(@RequestBody Hero hero) {
		return heroService.updateHero(hero);
	}

	@DeleteMapping("/hero/{idHero}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteHero(@PathVariable long idHero) throws Exception {
		try {
			heroService.deleteHero(idHero);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}
