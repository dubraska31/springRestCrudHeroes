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

	private long dni;
	private String nombre;
	private String apellido;

	public long getIdHero() {
		return idHero;
	}

	public void setIdHero(long idHero) {
		this.idHero = idHero;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
