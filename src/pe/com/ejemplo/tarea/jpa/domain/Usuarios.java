package pe.com.ejemplo.tarea.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuarios {
	@Id
	@GeneratedValue
	private int id_usuario;
	private String nom_usuario;
	private String ape_usuario;
	private String fec_usuario;
	private int dis_usuario;

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNom_usuario() {
		return nom_usuario;
	}

	public void setNom_usuario(String nom_usuario) {
		this.nom_usuario = nom_usuario;
	}

	public String getApe_usuario() {
		return ape_usuario;
	}

	public void setApe_usuario(String ape_usuario) {
		this.ape_usuario = ape_usuario;
	}

	public String getFec_usuario() {
		return fec_usuario;
	}

	public void setFec_usuario(String fec_usuario) {
		this.fec_usuario = fec_usuario;
	}

	public int getDis_usuario() {
		return dis_usuario;
	}

	public void setDis_usuario(int dis_usuario) {
		this.dis_usuario = dis_usuario;
	}

	public Usuarios(int id_usuario, String nom_usuario, String ape_usuario, String fec_usuario, int dis_usuario) {
		super();
		this.id_usuario = id_usuario;
		this.nom_usuario = nom_usuario;
		this.ape_usuario = ape_usuario;
		this.fec_usuario = fec_usuario;
		this.dis_usuario = dis_usuario;
	}

	public Usuarios() {
		super();
	}
}
