package br.com.furb.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe modelo para o CPF
 * @author ingmar
 *
 */
@XmlRootElement(name = "cpf")
public class Cpf {

	private String cpf;

	public Cpf() {
	}

	public Cpf(String cpf) {
		super();
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
