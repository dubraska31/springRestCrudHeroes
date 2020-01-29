package com.example.demo.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.example.demo.models.Hero;

@Service
public class HeroService {

	ArrayList<Hero> heroesList = new ArrayList<Hero>();

	public ArrayList<Hero> getHeroes() {
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
		int id=heroesList.get(heroesList.size()-1).getId() +1;
		hero.setId(id);
		heroesList.add(hero);
		return hero;
		
	}
	
	public Hero updateHero(int id, Hero newHero) {
		for (Hero oldHero : heroesList) {
			if (oldHero.getId() == id) {
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
