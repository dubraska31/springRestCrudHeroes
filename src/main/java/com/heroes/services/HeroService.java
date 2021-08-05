package com.heroes.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.heroes.models.Hero;

@Service
public class HeroService {

	ArrayList<Hero> heroesList = new ArrayList<Hero>();

	public ArrayList<Hero> getHeroes() {
		Hero hero = new Hero(1, "dubraska");
		
		heroesList.add(hero);
		
		return heroesList;
	}

	public Hero getHeroById(int id) {
		for (Hero hero : heroesList) {
			if (hero.getId() == id) {
				return hero;
			}
		}
		return null;
	}

	public Hero createHero(Hero hero) {
		if (heroesList.size() > 0) {
			int id = heroesList.get(heroesList.size() - 1).getId() + 1;
			hero.setId(id);
			heroesList.add(hero);
		} else {
			hero.setId(1);
			heroesList.add(hero);
		}

		return hero;

	}

	public Hero updateHero(Hero newHero) {
		for (Hero oldHero : heroesList) {
			if (oldHero.getId() == newHero.getId()) {
				int pos = heroesList.indexOf(oldHero);
				heroesList.set(pos, newHero);
				break;
			}
		}

		return newHero;
	}

	public void deleteHero(int id) {
		int pos = -1;
		for (Hero oldHero : heroesList) {
			if (oldHero.getId() == id) {
				pos = heroesList.indexOf(oldHero);
				break;
			}
		}

		heroesList.remove(pos);
	}
}
