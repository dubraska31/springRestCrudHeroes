package com.heroes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heroes.model.Hero;
import com.heroes.repository.HeroRepository;

@Service
public class HeroService {

	@Autowired
	HeroRepository heroRepository;

	public List<Hero> getAllHeroes() {
		return heroRepository.findAll();
	}

	public Hero getHeroById(long idHero) {
		return heroRepository.findById(idHero).get();
	}

	public Hero saveHero(Hero hero) {
		return heroRepository.save(hero);
	}

	public Hero updateHero(Hero hero) {
		return heroRepository.save(hero);
	}

	public void deleteHero(long idHero) {
		try {
			heroRepository.deleteById(idHero);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

}
