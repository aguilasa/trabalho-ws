package br.com.furb.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe que conter� a resposta da valida��o do CPF
 * @author ingmar
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Response {
	/**
	 * Se o CPF for v�lido o valor de result ser� 1, caso contr�rio ser� 0
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
