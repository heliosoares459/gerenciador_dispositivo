package br.com.scopus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Dispositivo {

	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dispositivo_id;
	private String tipo_dispositivo;
	private String fabricante;
	private String modelo;
	private String codigo_modelo;
	private String sistema_operacional;
	private String numero_armario;
	private String acessorios;
	private String imei;
	private String serial_scopus;
	private String observacoes;
	private String status;
	private String imagem; // - CAMINHODAIMAGEMNOSERVIDOR/UPLOAD
	//private Usuario responsavel_id;

	public Integer getDispositivo_id() {
		return dispositivo_id;
	}

	public void setDispositivo_id(Integer dispositivo_id) {
		this.dispositivo_id = dispositivo_id;
	}

	public String getTipo_dispositivo() {
		return tipo_dispositivo;
	}

	public void setTipo_dispositivo(String tipo_dispositivo) {
		this.tipo_dispositivo = tipo_dispositivo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCodigo_modelo() {
		return codigo_modelo;
	}

	public void setCodigo_modelo(String codigo_modelo) {
		this.codigo_modelo = codigo_modelo;
	}

	public String getSistema_operacional() {
		return sistema_operacional;
	}

	public void setSistema_operacional(String sistema_operacional) {
		this.sistema_operacional = sistema_operacional;
	}

	public String getNumero_armario() {
		return numero_armario;
	}

	public void setNumero_armario(String numero_armario) {
		this.numero_armario = numero_armario;
	}

	public String getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getSerial_scopus() {
		return serial_scopus;
	}

	public void setSerial_scopus(String serial_scopus) {
		this.serial_scopus = serial_scopus;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	/*public Usuario getResponsavel_id() {
		return responsavel_id;
	}

	public void setResponsavel_id(Usuario responsavel_id) {
		this.responsavel_id = responsavel_id;
	}*/

}
