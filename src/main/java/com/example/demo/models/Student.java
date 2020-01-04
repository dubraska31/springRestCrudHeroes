package com.example.demo.models;

public class Student {

	private int id;
	private String direccion;
	private int longitud;
	private int latitud;
	
	public Student() {
		super();
	}

	public Student(int id, String direccion, int longitud, int latitud) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.longitud = longitud;
		this.latitud = latitud;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getLatitud() {
		return latitud;
	}

	public void setLatitud(int latitud) {
		this.latitud = latitud;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + id;
		result = prime * result + latitud;
		result = prime * result + longitud;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (id != other.id)
			return false;
		if (latitud != other.latitud)
			return false;
		if (longitud != other.longitud)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", direccion=" + direccion + ", longitud=" + longitud + ", latitud=" + latitud
				+ "]";
	}
}
