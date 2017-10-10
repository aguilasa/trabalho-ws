package br.com.furb.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cpf")
public class Cpf {

	private String valor;

	public Cpf() {
	}

	public Cpf(String valor) {
		super();
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
