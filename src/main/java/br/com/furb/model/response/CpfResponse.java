package br.com.furb.model.response;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import br.com.furb.model.Cpf;

@XmlRootElement
@XmlSeeAlso(Cpf.class)
public class CpfResponse extends Response<Cpf> {

	public CpfResponse() {
	}

	public CpfResponse(int tipo, String mensagem, String erro, Cpf cpf) {
		super(tipo, mensagem, erro, cpf);
	}

	public CpfResponse(int tipo, String mensagem, Cpf cpf) {
		super(tipo, mensagem, cpf);
	}

}
