package com.heroes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hero")
public class Hero {

	@Column(name = "id_hero", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idHero;

	private String name;
	private String surname;

	public long getIdHero() {
		return idHero;
	}

	public void setIdHero(long idHero) {
		this.idHero = idHero;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
