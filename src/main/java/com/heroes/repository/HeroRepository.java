package com.heroes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.heroes.model.Hero;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Long> {

}
