package com.heroes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
		return heroRepository.findById(idHero).orElse(null);
	}

	public Hero saveHero(Hero hero) {
		return heroRepository.save(hero);
	}

	public Hero updateHero(Hero hero) {
		return heroRepository.save(hero);
	}

	public void deleteHero(long idHero) throws ResponseStatusException, Exception {
		try {
			Hero hero = getHeroById(idHero);

			if (hero == null) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Hero not found");
			}

			heroRepository.deleteById(idHero);
		} catch (ResponseStatusException e) {
			throw new ResponseStatusException(e.getStatus(), e.getReason());
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

}
