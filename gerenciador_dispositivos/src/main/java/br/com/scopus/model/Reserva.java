package br.com.scopus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Reserva {

	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reserva_id;
	//private Usuario usuario;
	//private Dispositivo dispositivo;
	private String status;

	public Integer getReserva_id() {
		return reserva_id;
	}

	public void setReserva_id(Integer reserva_id) {
		this.reserva_id = reserva_id;
	}

	/*public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}*/

	/*public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}*/

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
