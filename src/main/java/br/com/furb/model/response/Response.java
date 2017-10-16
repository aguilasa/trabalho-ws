package br.com.furb.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe que conterá a resposta da validação do CPF
 * @author ingmar
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Response {
	/**
	 * Se o CPF for válido o valor de result será 1, caso contrário será 0
	 */
	private int result;

	public Response() {
	}

	public Response(int result) {
		super();
		this.result = result;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

}
